import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetSocketAddress;
import java.net.Socket;


public class Client {
	public static void main(String[] args) {
		Socket cs = null;
		try {
			cs = new Socket();//���ϻ���
			System.out.println("���� ��û");//����.
			cs.connect(new InetSocketAddress("localhost", 5002));
			System.out.println("���� ����");
			
			
			byte[] b=null;
			String msg=null;
			OutputStream Ot = cs.getOutputStream();
			msg="���� ���";
			b=new byte[100];
			b=msg.getBytes("UTF-8");
			//���ڿ��� ����Ʈ�� �����ؼ� ����
			Ot.write(b);
			System.out.println("������ ������ ����");
			
			
			byte[] b1 = null;
			String msg1 = null;

			InputStream in = cs.getInputStream();
			// �������� �о���̱�
			b1 = new byte[100];
			int r = in.read(b1);
			// �޼��� ����Ʈ �迭�� �д´�.
			msg1 = new String(b1, 0, r, "UTF-8");
			// ����Ʈ �迭�� ���ڿ��� �ٲ۴�.
			System.out.println(msg1);

			System.out.println("������ �ޱ� ����");
			
			
			in.close();cs.close();
			Ot.close();
		} catch (Exception e) {
		}

	}
}
