import java.util.Scanner;

public class Day2_4 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int r = sc.nextInt();

		for (int i = -r; i <= r; i++) {
			for (int j = -r; j <= r; j++) {
				if (i * i + j * j >= r * r)
					System.out.print("*");
				else if (i * i + j * j < r * r)
					System.out.print(" ");
			}
			System.out.println();

		}

		for (int i = -r; i <= r; i++) {
			for (int j = -r; j <= r; j++) {
				if (i * j <= r * r)
					System.out.print("*");
				else if (i * j > r * r)
					System.out.print(" ");

			}
			System.out.println();
		}
	}

}
