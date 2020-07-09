import java.util.Scanner;

public class Day6_4 {
	public static void main(String[] args) {
		int a[][] = new int[2][3];
		Scanner s = new Scanner(System.in);
		for (int i = 0; i < 2; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.println("정수 입력");
				a[i][j] = s.nextInt();
			}
		}
		for (int i = 0; i < 2; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.print(a[i][j]+" , ");
			}
			System.out.println();
		}

	}
}
