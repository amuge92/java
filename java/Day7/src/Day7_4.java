import java.util.Scanner;

public class Day7_4 {
	public static void main(String[] args) {
		String str[][] = { { "book", "å" }, { "water", "��" }, { "note", "��Ʈ" } };
		Scanner s = new Scanner(System.in);
		int co = 0;
		for (int i = 0; i < str.length; i++) {
			System.out.println(str[i][0] + "�� ����?");
			System.out.println("���� �Է�");
			String c = s.next();
			if (c.equals(str[i][1])) {
				System.out.println("�����Դϴ�.");
			} else
				co++;
		}
		System.out.println("�����" + co);
	}
}
