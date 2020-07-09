import java.util.Scanner;

public class Day5_0 {

	public static void main(String[] args) {
//		두 과목 점수를 입력하여 평균 출력하는 프로그램(평균은소수점 이하 첫째자리까지 출력)
//		출력 결과) 두 과목의점수 : 70  80
//		           평균 : 75.0

		Scanner s = new Scanner(System.in);
		System.out.println("두 과목 점수 입력");
		int a = s.nextInt();
		int b = s.nextInt();
		System.out.println("두 과목의 점수" + a + " " + b);
		System.out.printf("평균 %.1f\n", (a + b) / 2.0);

//	   시간과 물건 개수로 금액 할인해주는 프로그램
//
//	   (총 금액은 10만원으로 설정, 시간과물건 개수는 입력받기)
//
//	   14시에 마트를 방문하고 물건 개수가 3개 이하이면 5%로 할인
//
//	   18시에 마트를 방문하고 물건 개수가 5개 이하이면 10%로 할인
//
//	   20시에 마트를 방문하고 물건 개수가 10개 이하이면 20%로 할인
		System.out.println("방문 시간과 물건 개수 입력");
		int t = s.nextInt();
		int ap = s.nextInt();
		double m = 100000;
		if (t == 14 && ap <= 3) {
			m = m * 0.95;
		}
		if (t == 18 && ap <= 5) {
			m = m * 0.9;

		}
		if (t == 20 && ap <= 10) {
			m = m * 0.8;

		}
		System.out.println("물건의 값" + m);

	}
}
