import java.util.Scanner;

public class Day7_0 {
	public static void main(String[] args) {
//		1. 50+11.8�� ����� �Ҽ����� ������ ����ض�.
//
//		System.out.println((int) (50 + 11.8));
////		2. 0~20���� �� �߿��� 3�� ����� �����ϰ� ����ض�.
////		(���� �ݺ����� break, continue�� �� ����Ͽ� ���)
//		int i = 0;
//		for (;;) {
//			if (!(i % 3 == 0))
//				System.out.println(i);
//			i++;
//			if (i > 20)
//				break;
//		}
//		int a = 0;
//		while (true) {
//			if (!(a % 3 == 0))
//				System.out.println(a);
//
//			a++;
//			if (a <= 20)
//				continue;
//			else
//				break;
//		}

//		3. ���� 10������ �Է¹޾� ��� ���(�迭, length�ʵ� ���)
//		3.1) ���� 10���� �Է¹޾� 7�� ����� ��� (�迭)

		Scanner s = new Scanner(System.in);
		System.out.println("���� 10�� �Է�");
		int[] in = new int[10];
		for (int i = 0; i < in.length; i++) {
			in[i] = s.nextInt();
		}
		for (int i = 0; i < in.length; i++) {
			System.out.print(in[i]);
		}
		
		//3.1
		for (int i = 0; i < in.length; i++) {
			if (in[i] % 7 == 0)
				System.out.println(in[i]);
		}

//		4. ���� �ڵ带 ���� 3������ �����Ͽ� ����ض�.
//		 double sum=0.0;
//		 double ary[]={1.0, 1.5, 2.0, 2.5};
//		 for(int i=0; i<4 ;i++)
//		    sum+=ary[i];
//		 System.out.println(sum);
		double sum = 0.0;
		double ary[] = { 1.0, 1.5, 2.0, 2.5 };

//		    4.1)while������ �ٲپ� ����ض�.
		int i = 0;
		while (i < 4) {
			sum += ary[i];
			i++;
		}
		System.out.println(sum);
//		    4.2)do~while������ �ٲپ� ����ض�.
		i = 0;
		sum = 0;
		do {
			sum += ary[i];
			i++;
		} while (i < 4);
		System.out.println(sum);
//		    4.3)for~each������ �ٲپ� ����ض�.
		sum = 0;
		for(double a:ary) {
			sum +=a;}
		System.out.println(sum);
	}
}
