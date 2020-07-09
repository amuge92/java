import java.awt.geom.Area;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Day9_7 {
	public static void main(String[] args) throws IOException {
		BufferedWriter bw = new BufferedWriter(new FileWriter("sample.txt"));
		bw.write("저는 자바를 좋아합니다.");

		BufferedReader br = new BufferedReader(new FileReader("sample.txt"));
		String str1 = null;
		while ((str1 = br.readLine()) != null) {

			System.out.println(str1);
		}
		bw.close();
		br.close();
	}
}