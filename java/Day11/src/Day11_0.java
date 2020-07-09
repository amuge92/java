import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Day11_0 {
	public static void main(String[] args) throws IOException {

		ObjectOutputStream os = null;
		try {
			os = new ObjectOutputStream(new FileOutputStream("ob.dat"));
			test s = new test();
			s.setName("ÇÑ±Û");
			s.setId("hangle");
			s.setAge(30);

			os.writeObject(s);
			
		} catch (Exception e) {
		}os.close();

	}
}
