import java.util.Scanner;

public class Day2_0 {
	public static void main(String[] args) {

		Scanner cs = new Scanner(System.in);

//		System.out.println("����");
//		int a = cs.nextInt();
//		System.out.println("Ű");
//		double b = cs.nextDouble();
//		System.out.println("�̸�");
//		String c = cs.next(); 
//		
//		System.out.printf("�̸� : %s\n���� : %d\nŰ : %.1f",c,a,b);
//
//		

		// 3���� Ű�� �Է¹޾� Ű�� ��� ���
//		double a, b, c;
//
//		System.out.println("Ű �Է�");
//		a = cs.nextDouble();
//		System.out.println("Ű �Է�");
//		b = cs.nextDouble();
//		System.out.println("Ű �Է�");
//		c = cs.nextDouble();
//
//		System.out.println("Ű�� �����" + ((a + b + c) / 3));
//		System.out.printf("Ű�� ����� %.1f",((a + b + c) / 3));

		
		System.out.println("ù ��° ����� ���� �Է��ϼ���");
		double a = cs.nextDouble();
		System.out.println("�� ��° ����� ���� �Է��ϼ���");
		double b = cs.nextDouble();
		
		System.out.printf("%.2f / %.2f = %.2f\n",a,b,a/b);
		System.out.printf("%.02f %% %.2f = %.2f\n",a,b,a%b);
		System.out.printf("%d %% %d = %d",(int)a,(int)b,(int)(a%b));
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
