import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class Day8_5 {
	public static void main(String[] args) {

		BufferedReader bu = null;
		PrintWriter pr = null;
		// 콘솔창에 문자를 입력해서 입력한 문자를 파일에 저장
		try {
			InputStreamReader in = new InputStreamReader(System.in);
			bu = new BufferedReader(in);
			// 콘솔에 입력

			FileWriter fw = new FileWriter("d.txt");
			pr = new PrintWriter(fw);
			// d.txt에 저장

			String str = null;
			while ((str = bu.readLine()) != null) {
				pr.println(str);
			}
			bu.close();
		} catch (Exception e) {
		}finally {pr.close();}
		
	}
}
