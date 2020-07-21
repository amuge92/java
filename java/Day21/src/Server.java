import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;

//서버 소켓을 먼저 만들어야 한다.
public class Server {
	public static void main(String[] args) {
		ServerSocket ss = null;
		try {
			ss = new ServerSocket();// 서버 소켓 생성!
			ss.bind(new InetSocketAddress("localhost", 5002));// 서버 소켓 인터넷 연결.
			// 서버소켓과 서버소켓이 연결될 ip주소와 포트번호 설정
			while (true) {
				System.out.println("연결 되기를 기다림");
				Socket so = ss.accept();
				// 연결요청을 수락하면서 소켓을 생성함.
				InetSocketAddress is = (InetSocketAddress) so.getRemoteSocketAddress();
				// 연결된 클라이언트 쪽의 IP와 포트정보가 궁금함.

				byte[] b = null;
				String msg = null;

				InputStream in = so.getInputStream();
				// 소켓으로 읽어들이기
				b = new byte[100];
				int r = in.read(b);
				// 메세지 바이트 배열을 읽는다.
				msg = new String(b, 0, r, "UTF-8");
				// 바이트 배열을 문자열로 바꾼다.
				System.out.println(msg);
				System.out.println("데이터 받기 성공");

				byte[] b1 = null;
				String msg1 = null;
				OutputStream Ot = so.getOutputStream();
				msg1 = "하이 써버";
				b1 = new byte[100];
				b1 = msg.getBytes("UTF-8");
				// 문자열을 바이트로 변경해서 보냄
				Ot.write(b1);
				System.out.println("데이터 보내기 성공");

				in.close();
				so.close();
				Ot.close();
				ss.close();

			}

		} catch (Exception e) {
		}
	}
}
