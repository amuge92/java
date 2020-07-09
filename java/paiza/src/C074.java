import java.util.Scanner;

public class C074 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String a1 = s.next();
		String a2 = s.next();
		String a3 = s.next();
		int n = Integer.parseInt(a1);
		int c1 = Integer.parseInt(a2);
		int c2 = Integer.parseInt(a3);
		int ka = 0;
		int suik = 0;
		int p = 0;
		for (int i = 0; i < n; i++) {
			p = s.nextInt();
			if (c1 >= p) {
				ka++;
				suik = suik - p;
			}
			if (c2 <= p) {
				suik = suik + p * ka;
				ka = 0;
			}

		}
		suik = suik + p * ka;
		System.out.println(suik);
	}
}