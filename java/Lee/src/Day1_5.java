import java.util.Scanner;

//�ҷ����� 
public class Day1_5 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		// ��ü ����
		// Ŭ������ ��ü�� = new Ŭ������(System.in);

		System.out.println("���� ���̿���?");
		int age = sc.nextInt();

		System.out.println("Ű�� ���̿���?");
		double h = sc.nextDouble();

		System.out.println("�̸�����?");
		String name = sc.next();

		System.out.println("���̴�" + age + "�� Ű�� " + h + "�̰� �̸���" + name + "�Դϴ�.");

		// ������ �Է��ؼ� age�� ����
		// . �� ���ٿ�����(����������)

		// int a; double b; ����
		sc.close();
	}
}
