class Circle {
	int r;

	Circle(int r) {
	this.r=r;}

	double getarea() {
		return r * r * 3.14;
	}
}

public class Day12_0 {
	public static void main(String[] args) {

		Circle[] ary;
		ary = new Circle[4];

		for (int i = 0; i < ary.length; i++) {
			System.out.println(ary[i].getarea());
		}

		// °´Ã¼ ¹è¿­
	}
}
