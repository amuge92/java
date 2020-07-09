import java.util.Scanner;

public class Day4_0 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

//		1.	5/3 �� ������� �Ҽ��� ��° �ڸ� ���� ����ض�. (printf ���)
		System.out.printf("%.2f\n", (double) 5 / 3);

//		2.	Ű(double)�� �ϳ� �Է¹޾� 160���� ������ ��small��, 170���� ������ ��medium��, 180���� ������ ��large�� ���
		double ki = sc.nextDouble();
		if (ki < 160)
			System.out.println("small");
		else if (ki < 170)
			System.out.println("medium");
		else if (ki < 180)
			System.out.println("large");
//		3.	n1�� 50, n2�� 100���� �ʱ�ȭ�Ͽ� �� �� �� ū ���� �Ǻ��Ͽ� ����ض�. (���� ������ Ȱ��)
		int n1 = 50, n2 = 100;
		System.out.println(n1 > n2 ? n1 : n2);

//		4.	���̸� �������� ��øif���� ����Ͽ� ����ض�.(����, Ű, ������ ���� ������ ����)
		System.out.println("���� �Է�");
		int age = sc.nextInt();
		System.out.println("Ű �Է�");
		int ki2 = sc.nextInt();
		if (age >= 20) {
			if (ki < 165) {
				System.out.println("S");
			} else if (ki < 175) {
				System.out.println("M");
			} else
				System.out.println("L");
		} else {
			if (ki < 160) {
				System.out.println("S");
			} else if (ki < 170) {
				System.out.println("M");
			} else
				System.out.println("L");
		}

//		5.	1���� 50������ ������ ����ض�.(for)
//		    5-1 1~50 ���� �� 6�� ����� ����ض�.(for, if)
		for (int i = 1; i <= 50; i++)
			System.out.print(i);
		System.out.println();
		for (int i = 1; i <= 50; i++) {
			if (i % 6 == 0) {
				System.out.println(i);

			}
		}

//		5-2 1~50������ ���� ����ض�.
		int hap = 0;
		for (int i = 1; i <= 50; i++) {
			hap = hap + i;

		}
		System.out.println(hap);
//		    5-3. 1~50 ������ random�Լ��� ���� ���� �� �� ������ �� �ϳ�(����)����ض�.
		int r = (int) (Math.random() * 50) + 1;
		System.out.println(r);
//		6.	a=10, b=20���� �ʱ�ȭ�ϰ�, ������(+,-,*,/)�� �ϳ��� �Է¹޴´�. 
		int a = 10, b = 20;
		System.out.println("������ �Է�");
		String adf = sc.next();
		char y = adf.charAt(0);
//		+�̸� �μ��� ��, -�̸� ��, *�̸� ��, /�̸� ���� ���Ͽ� ����ض�.(switch-case�� ���)
		switch (y) {
		case '+':
			System.out.println(a + b);
			break;
		case '-':
			System.out.println(a - b);
			break;
		case '*':
			System.out.println(a * b);
			break;
		case '/':
			System.out.println(a / b);
			break;

		}
	}

}
