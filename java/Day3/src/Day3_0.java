import java.util.Scanner;

public class Day3_0 {
	public static void main(String[] args) {
		Scanner cs = new Scanner(System.in);

		System.out.printf("%.2f\n", (double)10 / 4);

		System.out.println("���� �Է�");
		int aa = cs.nextInt();
		System.out.println("���� " + aa + "�� ������ = " + aa * aa);


		double a = 4.0, b = 1.2;
		System.out.printf("%.1f + %.1f = %.1f\n", a, b, a + b);
		System.out.printf("%d\n", (int) (a + b));


		System.out.println("�̸�  �Է�");
		String name = cs.next();
		System.out.println("��� ��");
		String home = cs.next();
		System.out.println("����");
		int age = cs.nextInt();
		System.out.println("������");
		double w = cs.nextDouble();

		System.out.println("�� �̸��� " + name + "�̴�.\n��� ���� " + home + "�̰�, ���̴� " + age + "�� �̴�.\n �����Դ� " + w + "kg�̴�.");
	}
}