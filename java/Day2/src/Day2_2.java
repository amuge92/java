import java.util.Scanner;

public class Day2_2 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		// ctrl + shift + 'O'

		double ki = 150.3, kg = 72.6;

		// Ű�� 180.2�̻��̰� �����԰� 80.0�̸��̸� ok��� �� �̿� CANCEL���

		if (ki >= 180.2 && kg < 80.0)
			System.out.println("ok");
		else
			System.out.println("CANCEL");

		if (ki >= 180.2 || kg < 80.0)
			System.out.println("ok");
		else
			System.out.println("CANCEL");
		if (ki >= 180.2 || kg < 80.0)
			System.out.println("ok");
		else
			System.out.println("CANCEL");

	}
}
