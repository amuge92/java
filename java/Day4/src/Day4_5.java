import java.util.Scanner;

public class Day4_5 {
	public static void main(String args[]) {

		Scanner sc = new Scanner(System.in);

		int sum = 0;
		System.out.println("���� 5�� �Է�");
		for (int i = 0; i < 5; i++) {
			int n = sc.nextInt();
			if (n < 0) {
				continue;
			} else {
				sum += n;
			}
		}
		System.out.println(sum);

//		while (true) {
//			int a = (int)(Math.random()* 45) + 1;
//			if(a==6)
//				break;
//		
//			System.out.println(a);
//		}
//		while (true) {
//			System.out.println("�Է�");
//			int d = sc.nextInt();
//
//			if (d != 0) {
//				hap += d;
//			} else
//				break;
//		}
	}
}