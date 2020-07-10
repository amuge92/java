interface Addin {
	void add();
}

class Add implements Addin {
	int s = 0;

	int add(int a) {
		for (int i = 1; i <= a; i++) {
			s = s + i;
		}
		return s;
	}

	int add(int a, int b) {
		return a + b;
	}

	public void add() {
	}
}

public class Day13_6 {
	public static void main(String[] args) {
		Add a = new Add();
		System.out.println(a.add(1, 4));
		System.out.println(a.add(10));
	}
}
