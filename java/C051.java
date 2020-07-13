import java.util.Scanner;

public class C051 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		String[] str1 = str.split(" ");
		int temp = 0;
		int[] a = new int[4];
		for (int i = 0; i < 4; i++) {
			a[i] = Integer.parseInt(str1[i]);
		}
		for (int i = 0; i < 3; i++) {
			for (int j = i + 1; j < 4; j++) {
				if (a[i] > a[j]) {
					temp = a[j];
					a[j] = a[i];
					a[i] = temp;

				}
			}

		}

		System.out.println(a[0] + a[1] + a[2] * 10 + a[3] * 10);
	}
}
