import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetSocketAddress;
import java.net.Socket;


public class Client {
	public static void main(String[] args) {
		Socket cs = null;
		try {
			cs = new Socket();//소켓생성
			System.out.println("연결 요청");//연결.
			cs.connect(new InetSocketAddress("localhost", 5002));
			System.out.println("연결 성공");
			
			
			byte[] b=null;
			String msg=null;
			OutputStream Ot = cs.getOutputStream();
			msg="하이 써버";
			b=new byte[100];
			b=msg.getBytes("UTF-8");
			//문자열을 바이트로 변경해서 보냄
			Ot.write(b);
			System.out.println("데이터 보내기 성공");
			
			
			byte[] b1 = null;
			String msg1 = null;

			InputStream in = cs.getInputStream();
			// 소켓으로 읽어들이기
			b1 = new byte[100];
			int r = in.read(b1);
			// 메세지 바이트 배열을 읽는다.
			msg1 = new String(b1, 0, r, "UTF-8");
			// 바이트 배열을 문자열로 바꾼다.
			System.out.println(msg1);

			System.out.println("데이터 받기 성공");
			
			
			in.close();cs.close();
			Ot.close();
		} catch (Exception e) {
		}

	}
}
