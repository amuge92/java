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
		System.out.println(y + "�⿡ ����" + in + "��ġ" + bran);
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
		// 1. Main()�� ���� Ŭ������ �����ض�.
		Tv1 t = new Tv1("�Ｚ", 2020, 20);
		t.show(); // 2020�⿡ �Ｚ���� ���� 20��ġ Tv ���

		// 2. Main()�� ���� Ŭ������ �����ض�.
//		(math, eng, com������ �Է¹޾� ����)
		int math = s.nextInt();
		int eng = s.nextInt();
		int com = s.nextInt();
		Score s1 = new Score(math, eng, com);
		System.out.println("�����" + s1.avg());
	}

}
