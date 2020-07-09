class Fruit {
	String co;
	int size;

	Fruit(String a, int b) {
		this.co = a;
		this.size = b;
	}

	void show() {
		System.out.println(co + size);
	}
}

class Apple extends Fruit {
	Apple(String a, int b) {
		super(a,b);
		System.out.println(a);
	}

}

public class Day12_4 {
	public static void main(String[] args) {

		Fruit f1 = new Apple("red", 10);
		f1.show();

	}
}
