class B {
	static final double pi = 3.14;
	double r;

	B(double r) {
		this.r = r;
	}

	void are() {
		System.out.println(r * r * pi);
	}
}

public class Day11_6 {
	public static void main(String[] args) {
		B b = new B(3);

		b.are();
		
	}
}
