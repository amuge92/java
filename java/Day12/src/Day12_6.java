abstract class A {
	abstract void aa();

	void run() {
		System.out.println("차가 움직인다.");
	}
}

class B extends A {
	void bb() {
	}

	void aa() {

	}
}

//추상 클래스안에는 일반적인 메소드, 추상 메소드 둘다 가능
//추상 메소드는 반드시 추상클래스 안에 있어야 한다.
public class Day12_6 {
	public static void main(String[] args) {

		
		B b = new B();
		b.run();
	}
}
