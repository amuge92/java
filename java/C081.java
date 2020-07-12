import java.util.Scanner;

public class C081 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int co = 0;
		String[] t = new String[n];
		String[] d = new String[n];
		for (int i = 0; i < n; i++) {
			t[i] = sc.next();
			d[i] = sc.next();
		}
		co = 0;
		for (int i = 0; i < n - 1; i++) {
			for (int j = 1 + i; j < n; j++) {
				if (t[i]!=""&&t[i].equals(t[j])) {
					if (!(d[i].equals(d[j]))) {
						co++;
						t[j]="";
						break;
					}
				}
			}
		}
		System.out.println(co);

	}
}
