import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class Day22_6 {
	public static void main(String[] args) throws IOException {
		Scanner sc1 = new Scanner(System.in);
		BufferedWriter bw = null;
		BufferedReader br = null;
		ServerSocket ss = null;
		Socket s = new Socket();
		try {
			ss = new ServerSocket(9999);
//			ss.bind(new InetSocketAddress("localhost", 9999));

		} catch (Exception e) {
		}
		System.out.println("���� �����");
		try {
			s = ss.accept();
			System.out.println("���� ");
		} catch (Exception e) {
		}
		System.out.println("��ٸ���..");
		try {
			bw = new BufferedWriter
					(new OutputStreamWriter
							(s.getOutputStream()));
			br = new BufferedReader
					(new InputStreamReader
							(s.getInputStream()));
		} catch (Exception e) {
		}
		while (true) {
			String msg = br.readLine();
			if (msg.equalsIgnoreCase("stop")) {
				System.out.println("����");
				break;
			}
			System.out.println(msg);
			System.out.println("������");
		String omsg = sc1.nextLine();
		bw.write(omsg + "\n");
		bw.flush();
		}
		
		
		
		bw.close();
		s.close();
		ss.close();
		br.close();
	}

}
