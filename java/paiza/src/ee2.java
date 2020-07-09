import java.util.Scanner;

public class ee2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String[] s = new String[n];
		String ss = "s sh ch o x";
		String s2 = "f,fe";
		String s3 = "y";// auieo

		for (int i = 0; i < n; i++) {
			s[i] = sc.next();
			if (s[i].substring(s[i].length() - 1).contains("f"))
				System.out.println(s[i].substring(0, s[i].length() - 1).concat("ves"));
			else if (s[i].substring(s[i].length() - 2).contains("fe"))
				System.out.println(s[i].substring(0, s[i].length() - 2).concat("ves"));
			else if (s[i].substring(s[i].length() - 1).contains("y")
					&& !(s[i].substring(s[i].length() - 2).contains("a"))
					&& !(s[i].substring(s[i].length() - 2).contains("u"))
					&& !(s[i].substring(s[i].length() - 2).contains("e"))
					&& !(s[i].substring(s[i].length() - 2).contains("o"))
					&& !(s[i].substring(s[i].length() - 2).contains("i")))
				System.out.println(s[i].substring(0, s[i].length() - 1).concat("ies"));
			else if (s[i].substring(s[i].length() - 1).contains("s") || s[i].substring(s[i].length() - 1).contains("o")
					|| s[i].substring(s[i].length() - 1).contains("x")
					|| s[i].substring(s[i].length() - 2).contains("sh")
					|| s[i].substring(s[i].length() - 2).contains("ch"))
				System.out.println(s[i].concat("es"));
			else
				System.out.println(s[i].concat("s"));
		}

	}

}
