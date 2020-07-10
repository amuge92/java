import java.util.Scanner;

class Circle {

	private double r;

	Circle(double r) {
		this.r = r;
	}

	double area() {
		return 3.14 * r * r;
	}
}

public class Day13_3 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		Circle[] c = new Circle[5];
		double hap=0;
		for (int i = 0; i < 5; i++) {
			c[i] = new Circle(s.nextDouble());
			hap = hap+c[i].area();
			
		}System.out.println(hap);

	}
}
