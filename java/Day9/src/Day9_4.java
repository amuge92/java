import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class Day9_4 {
	public static void main(String[] args) throws IOException {

		Scanner s = new Scanner(System.in);
		FileInputStream in = null;
		ByteArrayOutputStream out = null;
		try {

			in = new FileInputStream("g.txt");
			out = new ByteArrayOutputStream();

			int r = -1;
			while ((r = in.read()) != -1) {
				out.write(r);

			}
			byte[] b = out.toByteArray();
			for (int i = 0; i < b.length; i++)

				System.out.println(Byte.valueOf(b[i]));

		} catch (Exception e) {
		}
		out.close();
		in.close();
	}
}
