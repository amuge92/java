import java.util.Scanner;

class Tv1 {
	String bran;
	int y, in;

	Tv1(String bran, int y, int in) {
		this.bran = bran;
		this.y = y;
		this.in = in;
	}

	void show() {
		System.out.println(y + "년에 나온" + in + "인치" + bran);
	}
}

class Score {
	int math;
	int eng;
	int com;

	Score(int math, int eng, int com) {
		this.com = com;
		this.eng = eng;
		this.math = math;
	}

	double avg() {
		return (com + eng + math) / 3;
	}
}

public class Day13_1 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		// 1. Main()를 보고 클래스를 구현해라.
		Tv1 t = new Tv1("삼성", 2020, 20);
		t.show(); // 2020년에 삼성에서 나온 20인치 Tv 출력

		// 2. Main()를 보고 클래스를 구현해라.
//		(math, eng, com점수를 입력받아 구현)
		int math = s.nextInt();
		int eng = s.nextInt();
		int com = s.nextInt();
		Score s1 = new Score(math, eng, com);
		System.out.println("평균은" + s1.avg());
	}

}
