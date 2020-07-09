
public class Day2_6 {
	public static void main(String[] args) {
		for (int i = 0; i < 5; i++) {

			for (int j = 0; j < (4 + i); j++) {

				System.out.print((j < 4 + i)&&(0>=i-j) ? "*" : " ");

			}

			System.out.println();

		}

	}
}