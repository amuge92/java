import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;

//���� ������ ���� ������ �Ѵ�.
public class Server {
	public static void main(String[] args) {
		ServerSocket ss = null;
		try {
			ss = new ServerSocket();// ���� ���� ����!
			ss.bind(new InetSocketAddress("localhost", 5002));// ���� ���� ���ͳ� ����.
			// �������ϰ� ���������� ����� ip�ּҿ� ��Ʈ��ȣ ����
			while (true) {
				System.out.println("���� �Ǳ⸦ ��ٸ�");
				Socket so = ss.accept();
				// �����û�� �����ϸ鼭 ������ ������.
				InetSocketAddress is = (InetSocketAddress) so.getRemoteSocketAddress();
				// ����� Ŭ���̾�Ʈ ���� IP�� ��Ʈ������ �ñ���.

				byte[] b = null;
				String msg = null;

				InputStream in = so.getInputStream();
				// �������� �о���̱�
				b = new byte[100];
				int r = in.read(b);
				// �޼��� ����Ʈ �迭�� �д´�.
				msg = new String(b, 0, r, "UTF-8");
				// ����Ʈ �迭�� ���ڿ��� �ٲ۴�.
				System.out.println(msg);
				System.out.println("������ �ޱ� ����");

				byte[] b1 = null;
				String msg1 = null;
				OutputStream Ot = so.getOutputStream();
				msg1 = "���� ���";
				b1 = new byte[100];
				b1 = msg.getBytes("UTF-8");
				// ���ڿ��� ����Ʈ�� �����ؼ� ����
				Ot.write(b1);
				System.out.println("������ ������ ����");

				in.close();
				so.close();
				Ot.close();
				ss.close();

			}

		} catch (Exception e) {
		}
	}
}
