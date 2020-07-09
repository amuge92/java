class Circle {
	int r;
	private String name;

	double area() {
		double a = 3.14 * r * r;
		return a;
	}

	void show() {
		name = name+r;
	}

}

public class Day9_6 {
	public static void main(String[] args) {

		Circle c = new Circle();
		c.r = 10;
		c.name = "À±Çõ";
		double a = c.area();
		System.out.println(a);
		c.show();
	}
}
