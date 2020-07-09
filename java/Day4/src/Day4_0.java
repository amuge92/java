import java.util.Scanner;

public class Day4_0 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

//		1.	5/3 한 결과값을 소수점 둘째 자리 까지 출력해라. (printf 사용)
		System.out.printf("%.2f\n", (double) 5 / 3);

//		2.	키(double)를 하나 입력받아 160보다 작으면 “small”, 170보다 작으면 “medium”, 180보다 작으면 “large” 출력
		double ki = sc.nextDouble();
		if (ki < 160)
			System.out.println("small");
		else if (ki < 170)
			System.out.println("medium");
		else if (ki < 180)
			System.out.println("large");
//		3.	n1을 50, n2를 100으로 초기화하여 두 수 중 큰 수를 판별하여 출력해라. (삼항 연산자 활용)
		int n1 = 50, n2 = 100;
		System.out.println(n1 > n2 ? n1 : n2);

//		4.	나이를 기준으로 중첩if문을 사용하여 출력해라.(나이, 키, 사이즈 각각 변수를 선언)
		System.out.println("나이 입력");
		int age = sc.nextInt();
		System.out.println("키 입력");
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

//		5.	1부터 50까지의 정수를 출력해라.(for)
//		    5-1 1~50 정수 중 6의 배수를 출력해라.(for, if)
		for (int i = 1; i <= 50; i++)
			System.out.print(i);
		System.out.println();
		for (int i = 1; i <= 50; i++) {
			if (i % 6 == 0) {
				System.out.println(i);

			}
		}

//		5-2 1~50까지의 총합 출력해라.
		int hap = 0;
		for (int i = 1; i <= 50; i++) {
			hap = hap + i;

		}
		System.out.println(hap);
//		    5-3. 1~50 정수를 random함수로 범위 설정 한 후 무작위 수 하나(난수)출력해라.
		int r = (int) (Math.random() * 50) + 1;
		System.out.println(r);
//		6.	a=10, b=20으로 초기화하고, 연산자(+,-,*,/)중 하나를 입력받는다. 
		int a = 10, b = 20;
		System.out.println("연산자 입력");
		String adf = sc.next();
		char y = adf.charAt(0);
//		+이면 두수의 합, -이면 차, *이면 곱, /이면 몫을 구하여 출력해라.(switch-case문 사용)
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
