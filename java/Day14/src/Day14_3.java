import java.util.ArrayList;
import java.util.Scanner;

class Tv {
	private int size;

	Tv(int size) {
		this.size = size;

	}

	protected int getsize() {
		return size;
	}

}

class Tv1 extends Tv {
	String name;

	Tv1(int size, String name) {
		super(size);
		this.name = name;
	}

	void show() {
		System.out.println(name + getsize() + "인치 tv");
	}

}

class Shape {
	int a = 1;
	int b = 3;
	String c = null;

	Shape() {
	}

	Shape(int a, int b) {
		this.a = a;
		this.b = b;
	}

	String pr(String c) {
		this.c = c;
		return c;
	}

	void show() {
		for (int i = 0; i < a; i++) {
			for (int j = 0; j < b; j++) {
				System.out.print(c);
			}System.out.println();
		}
	}
}

public class Day14_3 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		Tv1 t = new Tv1(20, "삼성");
		t.show();

		Shape s1 = new Shape();
		Shape s2 = new Shape(2, 5);
		s1.pr("@");
		s2.pr("#");
		s1.show(); // 1행 3열
		s2.show();// 2행5열

	}
}
