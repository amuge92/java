class Food {
	void show() {
		System.out.println("음식");
	}
}

class Pizza extends Food {
	void show() {
		super.show();
		System.out.println("피자");
	}

}

class Fo<T> {
	T t;

	void set(T t) {
		this.t = t;
	}

	T get() {
		return t;
	}
}

public class Day20_5 {
//클래스 제한
	static void pr(Fo<? extends Food> f) { //Food에게 상속받는 클래스만 Fo<>안에 들어갈수있따. 반대는 super{
         Food fo = f.get();
         fo.show();
	}

	public static void main(String[] args) {

		Fo<Pizza> fp = new Fo();
		Pizza p = new Pizza();
		fp.set(p);
		pr(fp);
		
	}
}
