class Rec {
	int name;
	int a;

	Rec(int name, int a) {
		this.name = name;
		this.a = a;

	}

	void area() {
		System.out.println(name * a);
	}

}

public class Day10_3 {
	public static void main(String[] args) {

		Rec r1 = new Rec(4, 7);
		Rec r2 = new Rec(7, 9);

		r1.area();
		r2.area();
	}
}
