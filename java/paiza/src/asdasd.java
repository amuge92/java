import java.util.Scanner;

public class asdasd {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		int m = s.nextInt();// ������
		int n = s.nextInt();// �����
		int c[] = new int[m];// �������� Į�θ�
		for (int i = 0; i < m; i++) {
			c[i] = s.nextInt();
		}
		int[][] a = new int[n][m];// n����� ���� ��
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
