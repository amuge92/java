enum Day {
	Mon, Tue, Wed;
}

enum Month {
	Jun, July, Aug;
}

enum Price {

	COM(200), IPAD(100);

	int n;

	Price(int n) {
		this.n = n;
	}

	int get() {
		return n;
	}
}

public class Day17_7 {

	static void pr(Month m) {
		switch (m) {
		case Jun:
			System.out.println(Price.COM.n+100);
			System.out.println(Price.COM.ordinal()+100);
			System.out.println(Price.IPAD.ordinal()+100);
			break;
		}
	}

	public static void main(String[] args) {

		
		Day d= Day.Wed;
		pr(Month.Jun);
		Month m = Month.Aug;

	}
}
