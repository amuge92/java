import java.util.Scanner;

public class Day12_3 {
	static int get(int[][] grade) {
		int max1 = 0;

		for (int i = 0; i < grade.length; i++) {
			for (int j = 0; j < grade[i].length; j++) {
				max1 = Math.max(grade[i][j], max1);
			}
		}
		return max1;
	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int[][] grade = { { 55, 60, 65 }, { 85, 90, 95 } };
		int high;
		high = get(grade);
		System.out.println("���� ���� ������ " + high + "�� �Դϴ�.");

		String eng[] = { "student", "book", "future", "note" };
		String kor[] = { "�л�", "å", "�̷�", "��Ʈ" };
		// "stop"�� �Է��ϸ� ���α۸��� ������Ѷ�.
		while (true) {
			System.out.println("���� �ܾ� �Է� : ");
			String ss = s.next();
			for (int i = 0; i < eng.length; i++) {
				if (ss.equals(eng[i]))
					System.out.println(kor[i]);
			}
			if (ss.equals("stop"))
				break;

		}

	}
}
