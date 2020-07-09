
class Cir {
	double r;
	String d;
	Cir(double a, String b) {
	r=a;
	d=b;
	}

	void pr() {
		System.out.println(r * r * 3.14);
	}

}

public class Day13_0 {
	public static void main(String[] args) {
		Cir c = new Cir(2.5, "Circle");
		c.pr();
	}
}
