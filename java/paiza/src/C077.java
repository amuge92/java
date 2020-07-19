import java.util.Scanner;

public class C077 {

	static void hap(double hap) {
		if (hap >= 80)
			System.out.println("A");
		else if (hap >= 70)
			System.out.println("B");
		else if (hap >= 60)
			System.out.println("C");
		else if (hap < 60)
			System.out.println("D");
	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int k = s.nextInt();
		int n = s.nextInt();
		int d[] = new int[k];// 제출날짜
		int a[] = new int[k];// 정답수
		for (int i = 0; i < k; i++) {
			d[i] = s.nextInt();
			a[i] = s.nextInt();
		}
		for (int i = 0; i < k; i++) {
			double hap = 0;
			if (d[i] < 0) {
				hap = a[i] * 100.0/n;
				hap(hap);
			} 
			else if (d[i] <= 9) {
				hap = a[i] * 100.0 * 0.8/n;
				hap(hap);
			}
			else if (d[i] >= 10) {
				hap =0;
				hap(hap);
			}
		}

	}
}
