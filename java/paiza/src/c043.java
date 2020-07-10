import java.util.Scanner;

public class c043 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int a[] = new int[n];
		for (int i = 0; i < n; i++) {
			a[i] = s.nextInt();
		}
		int temp = 0;
		for (int i = 0; i < n - 1; i++) {
			for (int j = 1 + i; j < n; j++) {
				if (a[i] > a[j]) {
					temp = a[j];
					a[j] = a[i];
					a[i] = temp;
				}
			}
		}
		int co = 0;
		for (int i = 0; i < n; i++) {
			for (int j = 1 + i; j < n; j++) {
				if (a[i] == a[j])
					co++;
				else break;
			}
		}

	}
}
