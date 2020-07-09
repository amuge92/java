class Elec {
	String color;

	Elec(String c) {
		color = c;
	}
}

class Note extends Elec {

	int number;

	Note(String c, int n) {
		super(c);// color=c
		number = n;
	}

}

class Ipad extends Note {
	int co;

	Ipad(String c, int n, int m) {
		super(c, n);
		co = m;
	}

	void show() {
		System.out.println(color+ " " + number+ " " + co);
	}
}

public class Day12_5 {
	public static void main(String[] args) {

		Ipad i1 = new Ipad("white", 5, 5);
		Note i2 = new Ipad("white", 5, 5);
		i1.show();
	System.out.println(i2.number+ " "+i2.number);
	}
}
