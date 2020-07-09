
public class Day1_9 {
	public static void main(String[] args) {

		int a, b = 5, c = 3;

		a = b + c;

		System.out.printf("%d + %d=%d\n", b, c, a);

		int eng = 95, kor = 100;
		float result = ((float) eng + kor) / 2;
		System.out.printf("영어와 국어의 평균은 %.1f 점\n", result);

		result = (float) eng / kor;
		System.out.println(result);
		result = eng % kor;
		System.out.println(result);

	}
}
