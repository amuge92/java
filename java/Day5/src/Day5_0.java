import java.util.Scanner;

public class Day5_0 {

	public static void main(String[] args) {
//		�� ���� ������ �Է��Ͽ� ��� ����ϴ� ���α׷�(������Ҽ��� ���� ù°�ڸ����� ���)
//		��� ���) �� ���������� : 70  80
//		           ��� : 75.0

		Scanner s = new Scanner(System.in);
		System.out.println("�� ���� ���� �Է�");
		int a = s.nextInt();
		int b = s.nextInt();
		System.out.println("�� ������ ����" + a + " " + b);
		System.out.printf("��� %.1f\n", (a + b) / 2.0);

//	   �ð��� ���� ������ �ݾ� �������ִ� ���α׷�
//
//	   (�� �ݾ��� 10�������� ����, �ð������� ������ �Է¹ޱ�)
//
//	   14�ÿ� ��Ʈ�� �湮�ϰ� ���� ������ 3�� �����̸� 5%�� ����
//
//	   18�ÿ� ��Ʈ�� �湮�ϰ� ���� ������ 5�� �����̸� 10%�� ����
//
//	   20�ÿ� ��Ʈ�� �湮�ϰ� ���� ������ 10�� �����̸� 20%�� ����
		System.out.println("�湮 �ð��� ���� ���� �Է�");
		int t = s.nextInt();
		int ap = s.nextInt();
		double m = 100000;
		if (t == 14 && ap <= 3) {
			m = m * 0.95;
		}
		if (t == 18 && ap <= 5) {
			m = m * 0.9;

		}
		if (t == 20 && ap <= 10) {
			m = m * 0.8;

		}
		System.out.println("������ ��" + m);

	}
}
