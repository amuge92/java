class 계좌 {
	static final int 원금 = 100000;
	double 이자 = 0;

	double 이율() {
		return 이자 = 원금 * 1.001;
	}
}

class 보통 extends 계좌 {
}

class 적금 extends 계좌 {
	double 이율() {
		return 이자 = 원금 * 1.002;
	}
}

public class Day13_7 {
	public static void main(String[] args) {

		계좌 생활 = new 계좌();
		계좌 교통 = new 보통();
		계좌 보험 = new 적금();
		보통 보통 = new 보통();
		적금 적금 = new 적금();
		계좌 모든[] = { 적금, 생활, 교통, 보험, 보통 };

		for (int i = 0; i < 모든.length; i++) {
			System.out.println(모든[i].이율());
		}

	}
}
