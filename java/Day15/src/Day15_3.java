import java.util.InputMismatchException;
import java.util.Scanner;

public class Day15_3 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int a[] = new int[5];
		int hap = 0;
		for (int i = 0; i < a.length; i++) {
			try {
				System.out.print(i + 1 + "번째 정수 : ");
				a[i] = s.nextInt();
				hap = +a[i];
			} catch (InputMismatchException e) {
				--i;
				System.out.println("다시 입력해라");
				s.next();
				continue;
			}
		}
		System.out.println(hap);
	}
}
