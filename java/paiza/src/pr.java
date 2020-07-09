import java.util.Scanner;

public class pr {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int go = 0;
		int ri = 0;
		int bun = 0;
		int hap = 0;
		for (int i = 0; i < n; i++) {
			String a = s.next();
			int a1 = s.nextInt();
			int a2 = s.nextInt();
			int a3 = s.nextInt();
			int a4 = s.nextInt();
			int a5 = s.nextInt();
			hap = a1 + a2 + a3 + a4 + a5;
			ri = a2 + a3;
			bun = a4 + a5;
			if (a.equals("s")) {
				if (ri >= 160 && hap >= 350) {
					go++;
				}
			} else if (a.equals("l")) {
				if (bun >= 160 && hap >= 350) {
					go++;
				}
			}

		}
		System.out.println(go);
	}
}
