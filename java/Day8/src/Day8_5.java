import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class Day8_5 {
	public static void main(String[] args) {

		BufferedReader bu = null;
		PrintWriter pr = null;
		// �ܼ�â�� ���ڸ� �Է��ؼ� �Է��� ���ڸ� ���Ͽ� ����
		try {
			InputStreamReader in = new InputStreamReader(System.in);
			bu = new BufferedReader(in);
			// �ֿܼ� �Է�

			FileWriter fw = new FileWriter("d.txt");
			pr = new PrintWriter(fw);
			// d.txt�� ����

			String str = null;
			while ((str = bu.readLine()) != null) {
				pr.println(str);
			}
			bu.close();
		} catch (Exception e) {
		}finally {pr.close();}
		
	}
}
