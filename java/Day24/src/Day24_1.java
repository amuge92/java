import java.util.ArrayList;

class Per {
	String a;

	Per(String a) {
		this.a = a;
	}

	public String toString() {

		return a;
	}
}

class man {
	int a;
	
	man(int a) {
		this.a = a;
	}
	
	void show() {
		System.out.println(a);
	}
}

class man1 extends man {
	String b;
	
	man1(int a, String b) {
		super(a);
		this.b = b;
	}
	
	void show() {
		super.show();
		System.out.println(b);
	}
}
public class Day24_1 {
	static void hello(int a, double d) {

	};


	public static void main(String[] args) {

		ArrayList<Per> al = new ArrayList<Per>();
		al.add(new Per("aa"));
		al.add(new Per("bb"));
		al.add(new Per("cc"));
		for (int i = 0; i < al.size(); i++) {
			System.out.println(al.get(i));
		}

		man m = new man(20);
		man1 m1 = new man1(20, "È«±æ");
		m.show();
		m1.show();

	}
}
