import java.util.Scanner;

public class asdasd {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		int m = s.nextInt();// »§Á¾·ù
		int n = s.nextInt();// »ç¶÷¼ö
		int c[] = new int[m];// »§Á¾·ù´ç Ä®·Î¸®
		for (int i = 0; i < m; i++) {
			c[i] = s.nextInt();
		}
		int[][] a = new int[n][m];// n»ç¶÷ÀÌ ¸ÔÀº »§
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				a[i][j] = s.nextInt();
			}
		}
		int hap = 0;
		for (int i = 0; i < m; i++) {
			hap = 0;
			for (int j= 0; j< n; j++) {
				hap += c[j] * a[i][j] / 100;
				System.out.println(c[j] * a[i][j] / 100);
			}
			System.out.println(hap);
		}

	}
}
