import java.util.Scanner;

public class C024 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int i1 = 0;
		int i2 = 0;

		int[] n = new int[sc.nextInt()];
		sc.nextLine();
		for (int i = 0; i < n.length; i++) {
			String str = sc.nextLine();
			String[] str1 = str.split(" ");
			int str_2 = Integer.parseInt(str1[1]);
			if (str1[0].equals("SET")) {
				int str_3 = Integer.parseInt(str1[2]);
				if (str_2 == 1)
					i1 = str_3;
				else if (str_2 == 2)
					i2 = str_3;
			}
			if (str1[0].equals("ADD")) {
				i2 = i1 + str_2;
			} else if (str1[0].equals("SUB")) {
				i2 = i1 - str_2;
			}

		}
		System.out.println(i1 + " " + i2);

	}

}
