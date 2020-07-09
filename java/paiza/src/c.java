import java.util.Scanner;

public class c {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String nn = s.next();
		int n = Integer.parseInt(nn);
		String xx = s.next();
		int x = Integer.parseInt(xx);
		String x2 = Integer.toBinaryString(x);
		String x3 = "";
		for (int i = x2.length()-1; i >= 0; i--) {
			x3 = x3 + x2.charAt(i);
		}

		
		int k[] = new int[n];
		for (int i = 0; i < n; i++) {
			k[i] = s.nextInt();
			String a = x3.substring(k[i]-1,k[i]);
			System.out.println(a);

		}
	}
}
