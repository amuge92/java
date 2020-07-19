interface Re {

	default void show() {
		System.out.println("사각형");

	}

	abstract int area();
}

class Rec implements Re {
	int a, b;

	Rec(int a, int b) {
		this.a = a;
		this.b = b;
	}

	public int area() {
		int c = a * b;
		return c;
	}
}

public class Day14_5 {
	public static void main(String[] args) {
		Re r = new Rec(10, 20);
		r.show(); // "사각형!!" 출력

		System.out.println("면적" + r.area());
	}
}
