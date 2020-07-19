import java.util.Scanner;

enum Pro {

	JAVA(20), C(10), PYTHON(15);// 열거형 클래스의 객체..

	int n;

	Pro(int n) {

		this.n = n;

	}

	int get() {
		return n;
	}
}

public class Day17_6 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("무슨 과목");
		String n = s.next();

		Pro p = Pro.valueOf(Pro.class,n);
		//열거형 인스턴스 알아내는 코드
		//문자열 객체변환

		switch(p) {
		case JAVA:
			System.out.println(p.get());
			break;
		case PYTHON:
			System.out.println(p.get());
			
			break;
		case C:
			System.out.println(p.get());
			
			break;
		
		
		
		
		}
		
	}

}
