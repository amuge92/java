import java.util.Scanner;

public class Day8_0 {
	static void func(int a) {
		System.out.println(a % 5);
	};

	static double avg(int[] a) {
		int hap = 0;
		for (int i = 0; i < a.length; i++) {
			hap += a[i];
		}
		return (double) hap / a.length;

	};

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		int arr[] = { 3, 2, 1, 6, 5 };
		int tem;
		double a = avg(arr);
		System.out.println(a);
		
		
		
		int a = s.nextInt()
		
		for (int i = 0; i < 4; i++) {
			for (int j = i + 1; j < 5; j++) {
				if (arr[i] > arr[j]) {
					tem = arr[i];
					arr[i] = arr[j];
					arr[j] = tem;
				}
			}
		}
		for (int i = 0; i < arr.length; i++) {

			System.out.println(arr[i]);}
//
//		}
//
//		int a;
//		a = s.nextInt();
//		func(a);
//
//		int arr[] = { 4, 6, 7, 5, 4 };
//		show(arr);
//		System.out.println("1번째");
//		int a = s.nextInt();
//		System.out.println("연산자");
//		String ch = s.next();
//		System.out.println("2번째");
//		int b = s.nextInt();
//		try {
//			switch (ch) {
//			case "+":
//				System.out.println(a + b);
//				break;
//			case "-":
//				System.out.println(a - b);
//				break;
//			case "*":
//				if (b == 0 && a == 00)
//					throw new Exception("둘다 0이면 안됨");
//				else
//					System.out.println(a * b);
//				break;
//			case "/":
//				if (b == 0)
//					throw new Exception("0으로 나눌 수 없음");
//				else
//					System.out.println(a / b);
//				break;
//
//			}
//		} catch (Exception e) {
//			System.out.println(e.getMessage());
//		}

	}
}
