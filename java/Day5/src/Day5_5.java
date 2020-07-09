import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileReader;
import java.util.Scanner;

public class Day5_5 {
	public static void main(String[] args) throws Exception {

		FileReader fReader = new FileReader("c:\\windows\\win.ini");
		BufferedReader bReader = new BufferedReader(fReader);
		String str = null;

		while ((str = bReader.readLine()) != null) {
			System.out.println(str);
		}
		bReader.close();
		fReader.close();
	}
}