import java.util.Scanner;

public class Day4_6 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		int an = (int) (Math.random() * 100) + 1;
		int input = 0;
		int count = 0;

		System.out.println("1�� 100������ ������ �־��");
		do {
			count++;
			input = s.nextInt();
			if (input == an) {

				break;
			} else if (input < an) {
				System.out.println("�� ū��");
			} else
				System.out.println("�� ������");
		} while (true);
		System.out.println(an);
	}

//		String value = "12o34";
//		char ch = ' ';
//		boolean isNumber = true;
//
//		for (int i = 0; i < value.length(); i++) {
//
//			if (0 <= (value.charAt(i) - 48) && 9 >= (value.charAt(i) - 48)) {
//				isNumber = true;
//
//			} else {
//				isNumber = false;
//				break;
//			}
//		}
//		if (isNumber) {
//			System.out.println(value + "�� ���� �Դϴ�.");
//		} else {
//			System.out.println(value + "�� ���ڰ� �ƴմϴ�.");
//		}
}
