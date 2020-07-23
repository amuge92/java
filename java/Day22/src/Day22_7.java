import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class Day22_7 {
	public static void main(String[] args) throws IOException {
		Scanner sc1 = new Scanner(System.in);
		BufferedWriter bw = null;
		BufferedReader br = null;

		Socket so = null;
		so = new Socket("localhost", 9999);
		try {
//			so.connect(new InetSocketAddress("localhost", 9999));
		} catch (Exception e) {
		}
		try {
			bw = new BufferedWriter(new OutputStreamWriter(so.getOutputStream()));
			br = new BufferedReader(new InputStreamReader(so.getInputStream()));

			while (true) {
				System.out.println("º¸³»±â");
				String omsg = sc1.nextLine();
				if (omsg.equalsIgnoreCase("stop")) {
					bw.write(omsg + "\n");
					bw.flush();
					break;
				}

				bw.write(omsg + "\n");
				bw.flush();
				String msg = br.readLine();
				System.out.println(msg);
			}
		} catch (Exception e) {
		}
		bw.close();
		so.close();
		br.close();
	}

}
