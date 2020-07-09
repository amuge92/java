import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Day9_5 {
	public static void main(String[] args) throws IOException {

		DataOutputStream out = null;
		try {
			int a = 5;
			double b = 1.5;
			boolean c = true;
			out = new DataOutputStream(new FileOutputStream("h.txt"));
			out.writeInt(a);
			out.writeDouble(b);
			out.writeBoolean(c);
			DataInputStream in = new DataInputStream(new FileInputStream("h.txt"));
			
			int aa =in.readInt();
			double bb =in.readDouble();
			boolean cc =in.readBoolean();
			
			

			System.out.println(aa);
			System.out.println(bb);
			System.out.println(cc);
		} catch (Exception e) {

		}
		out.close();
}
