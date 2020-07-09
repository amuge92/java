class Number {

	Number() {
	}

	static void show(int a) {
		System.out.println(a);
	}

	void show(double a) {
		System.out.println(a);
	}
}

public class Day11_8 {
	public static void main(String[] args) {

		Number.show(20);
		Number n = new Number();
		n.show(3.14);

	}
}
