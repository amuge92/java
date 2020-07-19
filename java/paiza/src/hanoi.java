import java.util.Scanner;

class hanoi {
	static String pow(int n1) {
		String a;
		if (n1 == 2)
			return "001";
		else if (n1 == 1)
			return "0";
		String str = pow(n1 - 1);
		String trs = "";
		for (int i = str.length() - 1; i >= 0; i--) {
			if (str.charAt(i) == '0') {
				trs = trs + '1';
			}
			if (str.charAt(i) == '1') {
				trs = trs + '0';
			}
		}
		a = pow(n1 - 1) + "0" + trs;
		return a;
	}

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		System.out.println(pow(n));

	}
}
