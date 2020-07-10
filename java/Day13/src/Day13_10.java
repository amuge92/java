interface Food {
	String name();

}

class Pizza implements Food {
	public String name() {
		return "Pizza";
	}
}

class Steak implements Food {
	public String name() {
		return "Steak";
	}
}

public class Day13_10 {
	static void pr(Food f) {
		System.out.println(f.name());
	}

	public static void main(String[] args) {
		pr(new Pizza());
		pr(new Steak());

	}
}
