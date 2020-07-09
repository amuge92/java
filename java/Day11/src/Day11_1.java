import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Day11_1 {
	public static void main(String[] args) throws IOException {
		ObjectInputStream is = null;
		try {

			is = new ObjectInputStream(new FileInputStream("ob.dat"));

			test s = (test) is.readObject();
			System.out.println(s.getName());
			System.out.println(s.getId());
			System.out.println(s.getAge());
		} catch (Exception e) {
		}
		is.close();
	}
}
