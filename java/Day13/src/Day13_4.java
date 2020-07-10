import java.util.Scanner;

public class Day13_4 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int a[] = new int[10];
		for (int i = 0; i < 10; i++) {
			a[i] = s.nextInt();
		}
		int temp;
		for (int i = 0; i < 9; i++) {
			for (int j = 1 + i; j < 10; j++) {
				if (a[i] > a[j]) {
					temp = a[j];
					a[j] = a[i];
					a[i] = temp;
				}
			}
		}for (int i = 0; i < 10; i++) {
			System.out.print(a[i]+" ");
		}

	}
}
