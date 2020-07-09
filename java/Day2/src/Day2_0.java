import java.util.Scanner;

public class Day2_0 {
	public static void main(String[] args) {

		Scanner cs = new Scanner(System.in);

//		System.out.println("나이");
//		int a = cs.nextInt();
//		System.out.println("키");
//		double b = cs.nextDouble();
//		System.out.println("이름");
//		String c = cs.next(); 
//		
//		System.out.printf("이름 : %s\n나이 : %d\n키 : %.1f",c,a,b);
//
//		

		// 3명의 키를 입력받아 키의 평균 출력
//		double a, b, c;
//
//		System.out.println("키 입력");
//		a = cs.nextDouble();
//		System.out.println("키 입력");
//		b = cs.nextDouble();
//		System.out.println("키 입력");
//		c = cs.nextDouble();
//
//		System.out.println("키의 평균은" + ((a + b + c) / 3));
//		System.out.printf("키의 평균은 %.1f",((a + b + c) / 3));

		
		System.out.println("첫 번째 계산할 값을 입력하세요");
		double a = cs.nextDouble();
		System.out.println("두 번째 계산할 값을 입력하세요");
		double b = cs.nextDouble();
		
		System.out.printf("%.2f / %.2f = %.2f\n",a,b,a/b);
		System.out.printf("%.02f %% %.2f = %.2f\n",a,b,a%b);
		System.out.printf("%d %% %d = %d",(int)a,(int)b,(int)(a%b));
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
