import java.util.Scanner;

public class Day5_2 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		int sum = 0;
		int multi = 1;
		int a[] = new int[4];
		int i = 0;
		while (i < 4) {
			System.out.println(i + 1 + "번째 숫자");
			a[i] = s.nextInt();
			sum += a[i];
			multi *= a[i];
			i++;
		}
		System.out.println(sum + "   " + multi);
	}
}