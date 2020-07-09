
public class Day4_2 {
	public static void main(String[] args) {

//		for (int i = 0; i < 4; i++) {
//			for (int j = 0; j < 4 - i; j++) {
//				System.out.print(" ");
//
//			}
//			for (int j = 0; j < 1 + i; j++) {
//				System.out.print("*");
//
//			}
//			System.out.println("");
//		}

		for (int i = 0; i < 9; i++) {
			if (i <= 4) {
				for (int j = 0; j < 1 + i; j++)
					System.out.print("*");

			} else if (4 < i) {
				for (int j = 0; j < 9 - i; j++)
					System.out.print("*");
			}
			System.out.println();
		}

	}
}
