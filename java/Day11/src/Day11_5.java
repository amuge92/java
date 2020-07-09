class AAA {
	void ride() {
		System.out.println("오버라이딩AA");
	}

	void load() {

		System.out.println("오버로딩AA");
	}

}

class BB extends AAA {
	void ride() {// 오버 라이딩
		System.out.println("오버라이딩BB");
	}

	void load(int n) {// 오버로딩

		System.out.println("오버로딩BB");
	}

}

public class Day11_5 {
	public static void main(String[] args) {

		AAA a = new AAA();
		BB b = new BB();
		a.ride();
		a.load();
		b.ride();
		b.load();
		b.load(1);

	}
}
