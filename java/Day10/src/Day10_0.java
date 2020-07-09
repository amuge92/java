import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Day10_0 {

	static int same(int[] lo, int[] my) {
		Scanner s = new Scanner(System.in);
		int same = 0;
		for (int i = 0; i < my.length; i++) {
			for (int j = 0; j < my.length; j++)
				if (lo[i] == my[j])
					same++;
		}
		return same;
	}

	static void show(int[] a) {
		int temp;
		int[] b = new int[a.length];
		for (int i = 0; i < a.length / 2; i++) {
			temp = a[i];
			a[i] = a[a.length - 1 - i];
			a[a.length - 1 - i] = temp;
		}
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i]);
		}
		System.out.println();

	}

	public static void main(String[] args) throws IOException {
		Scanner s = new Scanner(System.in);

//		

		int lotto[] = { 4, 10, 25, 30, 45, 47 };
		int my[] = { 1, 4, 7, 26, 45, 48 };
		int r;

		r = same(lotto, my);

		System.out.printf("��ġ�ϴ� ��ȣ�� ���� : %d\n", r);

		int ary[] = { 6, 2, 8, 4, 9 };
		show(ary);

		int[][] arya = { { 43, 97 }, { 34, 77, 87 }, { 100, 95, 38, 89 } };
		int happ = 0;
		double ad = 0;
		for (int i = 0; i < arya.length; i++) {
			for (int j = 0; j < arya[i].length; j++) {
				happ += arya[i][j];
			}
			ad = ad + arya[i].length;
		}
		System.out.println(ad);
		System.out.println(happ);
		System.out.printf("%.1f\n", happ / ad);

		System.out.println("5�� �л� ���� �Է� = ");
		int a[] = new int[5];
		int temp;
		for (int i = 0; i < 5; i++) {
			a[i] = s.nextInt();
		}
		for (int i = 0; i < 4; i++) {
			for (int j = 1 + i; j < 5; j++) {
				if (a[i] > a[j]) {
					temp = a[j];
					a[j] = a[i];
					a[i] = temp;
				}
			}

		}
		double av = (a[1] + a[2] + a[3]) / 3;
		System.out.println("��ȿ���� = " + a[1] + "" + a[2] + "" + a[3]);
		System.out.printf("��� = %.1f\n", av);

		BufferedWriter bw = new BufferedWriter(new FileWriter("sample.txt"));
		bw.write("���� �ڹٸ� �����մϴ�.");
		bw.newLine();
		bw.write("���� �ڹٸ� �����մϴ�.");
		bw.newLine();
		bw.write("���� �ڹٸ� �����մϴ�.");

		BufferedReader br = new BufferedReader(new FileReader("sample.txt"));
		String[] str1 = new String[1];
		while ((str1[0] = br.readLine()) != null) {

			System.out.println(str1[0]);
		}
		bw.close();
		br.close();
	}
}
