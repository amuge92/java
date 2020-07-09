import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Day10_1 {
	public static void main(String[] args) throws IOException {
		Scanner s = new Scanner(System.in);
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] str = new String[1024];
		BufferedWriter bw = new BufferedWriter(new FileWriter("tt.txt"));
		for (int i = 0; i < str.length; i++) {
			if ((str[i] = br.readLine()) != null) {
				bw.write(str[i]);
				bw.newLine();

			}

		}

		br.close();
		bw.close();
		// 입력받은 텍스트를 tt.txt.에 저장하는 프로그램
		// 출력

	}
}
