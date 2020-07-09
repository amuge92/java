import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class asd {
	public static void main(String[] args) throws IOException {
		BufferedReader br1 = new BufferedReader(new FileReader("test03.txt"));
		int r =0;
		while ((r=br1.read())!= -1) {
			System.out.print((char) r);
		}
		br1.close();
	}
}
