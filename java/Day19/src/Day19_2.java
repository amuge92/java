import java.util.Arrays;
import java.util.Scanner;

class Calc {
	int a;

	Calc(int a) {
		this.a = a;
	}

	int hap = 0;

	void calculate() {
		for (int i = 1; i <= a; i++) {
			if (i % 2 == 1)
				hap += i;
		}
		System.out.println(hap);
	}
}

public class Day19_2 {
	static Scanner s = new Scanner(System.in);

	static void high(int[][] a, int b, int c) {
		a = new int[b][c];
		for (int i = 0; i < b; i++) {
			for (int j = 0; j < c; j++) {
				a[i][j] = s.nextInt();
			}
		}
		int max = 0;
		max = a[0][0];
		for (int i = 0; i < b; i++) {
			for (int j = 0; j < c - 1; j++) {
					if ( max< a[i][j])
						max = a[i][j];
			}
		}
		System.out.println(max);
	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int a = 0;
		for (;;) {
			a = s.nextInt();
			if (a < 5) {
				System.out.println("다시입력");
			} else
				break;
		}
		Calc c = new Calc(a);
		c.calculate();

		int[][] ary = new int[3][3];
		high(ary, 3, 3);
	}
}
