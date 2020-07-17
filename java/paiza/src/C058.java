import java.util.Scanner;

public class C058 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		int n = s.nextInt();
		String t = s.next();
		String t2 = t;
		String T = s.next();
		for (int i = 0; i < n;i++ ) {
			if (t.equals(T)) {
				System.out.println(0);
				break;}
			t2 = t2.substring(n-1, n) + t2.substring(0, n-1);
			if (t2.equals(T)) {
				i++;
				System.out.println(i);
				break;

		}

	}
}}
