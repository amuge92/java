import java.util.Scanner;

public class Day6_5 {

	int plus(int v1, int v2) {
		int result = v1 + v2;
		return result; 
	}

	static int coff(int button) {
		System.out.println("��");
		System.out.println("��");

		switch (button) {
		case 1:
			System.out.println("����");
			break;
		case 2:
			System.out.println("����");
			break;
		case 3:
			System.out.println("��");
			break;
		default:
			System.out.println("�ϰų�");

		}
		System.out.println("�� ��");
		System.out.println("��Ǭ");

		return 0;
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		Day6_5 plus = new Day6_5();
		plus.plus(20,20);
		System.out.println(plus.plus(20,20));
		 
		int coffee;
		System.out.println("1,2,3");
		coffee = s.nextInt();
		coff(coffee);
		System.out.println("����");
		System.out.println(coff(coffee));
	}
}
