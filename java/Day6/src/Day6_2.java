import java.util.Scanner;

public class Day6_2 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int[] a = new int[10];

		for (int i = 0; i < 10; i++) {
			a[i] = s.nextInt();
			if (a[i] % 5 == 0)
				System.out.println(a[i]);
		}
		// for~each
		// 1~5까지 배열 초기화
	}
}
