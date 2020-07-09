
public class Day11_7 {
	static int exp(int a, int b) {
		int e = 1;
		for (int i = 1; i <= b; i++) {
			e = e * a;
		}
		return e;
	}

	public static void main(String[] args) {

		int a = exp(3, 10);
		System.out.println(a);

		int ary[][] = new int[3][4];
		int n = 0;
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 4; j++) {
				ary[i][j] = i + j;
				System.out.print(ary[i][j]);
			}
			System.out.println();

		}

	}
}
