import java.util.Scanner;

class Pet {

}

public class Day7_1 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int[][] a = { { 0, 1, 2 }, { 3, 4, 5 }, { 6, 7, 8 } };
		char[][] ch = { { 'a', 'b', 'c' }, { 'd', 'e', 'f' } };

		int[][] ran = new int[3][4];

		for (int i = 0; i < ran.length; i++) {
			for (int j = 0; j < ran[i].length; j++) {
				ran[i][j] = (int) (Math.random() * 9 + 1);
				System.out.printf("%3d", ran[i][j]);
			}
			System.out.println();
		}
	}

}
