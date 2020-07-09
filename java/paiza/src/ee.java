import java.util.Arrays;
import java.util.Scanner;

public class ee {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String str = s.nextLine();
		String[] strr = str.split(" ");
		int a = Integer.parseInt(strr[0]);
		int b = Integer.parseInt(strr[1]);
		for (int i = 0; i < a; i++) {
			s.nextLine();
			String str1 = s.nextLine();
			s.nextLine();
			String[] str11 = str1.split(" ");
			s.nextLine();
			int c = Integer.parseInt(str11[0]);
			int d = Integer.parseInt(str11[1]);
			if ((c - d * 5) >= b)
				System.out.println(i);

		}

	}
}
