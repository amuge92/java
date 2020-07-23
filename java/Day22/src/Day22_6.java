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
		System.out.println("연결 대기중");
		try {
			s = ss.accept();
			System.out.println("연결 ");
		} catch (Exception e) {
		}
		System.out.println("기다린다..");
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
				System.out.println("종료");
				break;
			}
			System.out.println(msg);
			System.out.println("보내기");
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
