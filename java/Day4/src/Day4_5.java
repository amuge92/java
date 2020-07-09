import java.util.Scanner;

public class Day4_5 {
	public static void main(String args[]) {

		Scanner sc = new Scanner(System.in);

		int sum = 0;
		System.out.println("정수 5개 입력");
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
//			System.out.println("입력");
//			int d = sc.nextInt();
//
//			if (d != 0) {
//				hap += d;
//			} else
//				break;
//		}
	}
}