import java.util.Scanner;

public class Day3_0 {
	public static void main(String[] args) {
		Scanner cs = new Scanner(System.in);

		System.out.printf("%.2f\n", (double)10 / 4);

		System.out.println("정수 입력");
		int aa = cs.nextInt();
		System.out.println("정수 " + aa + "의 제곱은 = " + aa * aa);


		double a = 4.0, b = 1.2;
		System.out.printf("%.1f + %.1f = %.1f\n", a, b, a + b);
		System.out.printf("%d\n", (int) (a + b));


		System.out.println("이름  입력");
		String name = cs.next();
		System.out.println("사는 곳");
		String home = cs.next();
		System.out.println("나이");
		int age = cs.nextInt();
		System.out.println("몸무게");
		double w = cs.nextDouble();

		System.out.println("내 이름은 " + name + "이다.\n사는 곳은 " + home + "이고, 나이는 " + age + "살 이다.\n 몸무게는 " + w + "kg이다.");
	}
}