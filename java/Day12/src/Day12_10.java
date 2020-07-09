interface Car {

	int CAR_COUNT = 0;

	void work();

	default int num() {
		return 0;
	};
}

class Sedan implements Car {
	public/* 퍼블릭 필수 */ void work() {
		System.out.println("승용차가 사람을 태우고 있습니다.");
	}

}

class Truck implements Car {
	public void work() {
		System.out.println("트럭이 짐을 싣고 있습니다.");

	}
}

public class Day12_10 {
	public static void main(String[] args) {
//인터페이스는 기본 설정값이(추상메소드, 상수값(final))
//메소드를 구현하려면 메소드 앞에 default
//인터페이스 안에 abstract라는 키워드를 안적어도 저절로 추상메소드로 인식한다.
		Sedan s = new Sedan();
		Truck t = new Truck();
		s.work();
		t.work();

	}
}
