import java.util.Arrays;
import java.util.Scanner;

public class so {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String a = "";
		int y = sc.nextInt();
		int m = sc.nextInt();
		int d = sc.nextInt();

		if (y>2019||(y == 2019 && m >= 5 && d >= 1)) {
			a = "ֵ��";
			y = y - 2018;
			if (y == 1)
				System.out.println(a + "�Ҵ" + m + "��" + d +"��");
			else System.out.println(a + y + "Ҵ" + m + "��" + d +"��");
		} else if (y>1989||(y == 1989 && m >= 1 && d >= 8)) {
			a = "����";
			y = y - 1988;
			if (y == 1)
				System.out.println(a + "�Ҵ" + m + "��" + d +"��");
			else System.out.println(a + y + "Ҵ" + m + "��" + d +"��");
		} else if (y>1926||(y == 1926 && m >= 12 && d >= 25)) {
			a = "���";
			y = y - 1925;
			if (y == 1)
				System.out.println(a + "�Ҵ" + m + "��" + d +"��");
			else System.out.println(a + y + "Ҵ" + m + "��" + d +"��");
		} else if (y>1912||(y == 1912 && m >= 7 && d >= 30)) {
			a = "����";
			y = y - 1911;
			if (y == 1)
				System.out.println(a + "�Ҵ" + m + "��" + d +"��");
			else System.out.println(a + y + "Ҵ" + m + "��" + d +"��");
		} else if (y <= 1912) {
			a = "٥��";
			y = y - 1867;
			if (y == 1)
				System.out.println(a + "�Ҵ" + m + "��" + d +"��");
			else System.out.println(a + y + "Ҵ" + m + "��" + d +"��");
		}

	}
}