
public class Day4_4 {
	public static void main(String[] args) {

			for (int e = 2; e <= 9; e++) {
				System.out.printf("  #Á¦%d´Ü#", e);

			}System.out.println();
		for (int i = 1; i <= 9; i++) {

			for (int j = 2; j <= 9; j++) {

//				System.out.print(j + "X" + i + " = " + j * i);
				System.out.printf("%2d X%2d =%2d |", j, i, j * i);

			}
			System.out.println();

		}
		System.out.println();
		System.out.println();
		for (int i = 9; i >= 1; i--) {

			for (int j = 9; j >= 2; j--) {

//				System.out.print(j + "X" + i + " = " + j * i);
				System.out.printf("%2d X%2d =%2d |", j, i, j * i);

			}
			System.out.println();

		}

	}
}
