import java.util.Scanner;

public class Day7_0 {
	public static void main(String[] args) {
//		1. 50+11.8의 결과를 소수점을 버리고 출력해라.
//
//		System.out.println((int) (50 + 11.8));
////		2. 0~20까지 수 중에서 3의 배수를 제외하고 출력해라.
////		(무한 반복문과 break, continue를 다 사용하여 출력)
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

//		3. 정수 10개를를 입력받아 평균 출력(배열, length필드 사용)
//		3.1) 정수 10개를 입력받아 7의 배수만 출력 (배열)

		Scanner s = new Scanner(System.in);
		System.out.println("정수 10개 입력");
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

//		4. 다음 코드를 보고 3가지로 변경하여 출력해라.
//		 double sum=0.0;
//		 double ary[]={1.0, 1.5, 2.0, 2.5};
//		 for(int i=0; i<4 ;i++)
//		    sum+=ary[i];
//		 System.out.println(sum);
		double sum = 0.0;
		double ary[] = { 1.0, 1.5, 2.0, 2.5 };

//		    4.1)while문으로 바꾸어 출력해라.
		int i = 0;
		while (i < 4) {
			sum += ary[i];
			i++;
		}
		System.out.println(sum);
//		    4.2)do~while문으로 바꾸어 출력해라.
		i = 0;
		sum = 0;
		do {
			sum += ary[i];
			i++;
		} while (i < 4);
		System.out.println(sum);
//		    4.3)for~each문으로 바꾸어 출력해라.
		sum = 0;
		for(double a:ary) {
			sum +=a;}
		System.out.println(sum);
	}
}
