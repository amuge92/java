import java.util.Scanner;

public class Day9_1 {
	static void func(int a) {
		System.out.println("¸ò : " + a / 5 + "³ª¸ÓÁö : " + a % 5);

	};

	static void pr(int[] a, int b) {
		for (int i = 0; i < b; i++) {
			int s = a[i] / 5;

			for (int j = 0; j < s; j++) {
				System.out.print('*');
			}
			System.out.println();

		}

	};

	static String show(char a, int b) {
		String str = "";
		for (int i = 0; i < b; i++)

			str = str + a;

		return str;
	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int[] a = new int[10];
		for (int i = 0; i < 10; i++) {
			a[i] = s.nextInt();

			if (a[i] % 4 == 0)
				System.out.println(a[i]);

		}

		int c = 50, b = 150;
		int aa = (c > b ? c * b : c % b);
		System.out.println(aa);

		int i = 1;
		int hap = 0;
		while (i <= 100) {
			if (i % 2 == 0 && i % 7 == 0) {
				System.out.println(i);
				hap += i;
			}
			i++;
		}

		try {
			int bb = s.nextInt();
			String cc = bb % 2 == 0 ? "Â¦¼ö" : "È¦¼ö";
			System.out.println(cc);
		} catch (Exception e) {
		};

		
		
		System.out.println("¾ç¼ö ÀÔ·Â:");
		int tt = s.nextInt();
		func(tt);

		int score[] = new int[] { 58, 60, 86, 90, 84 };
		pr(score, 5);

		System.out.println(show('$', 10));

		String str2 = "°øºÎ´Â ¾î·ÆÁö¸¸, Àç¹Õ³×¿ä";
		String str3[] = str2.split(",");
		System.out.println(str2.charAt(6));
		str2.endsWith("´Â");
		System.out.println(str2.substring(0, 3));

	}
}
