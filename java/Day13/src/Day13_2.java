import java.util.Scanner;

class XY {
	int a, b;

	void set(int a, int b) {
		this.a = a;
		this.b = b;
	}

	void show() {
		System.out.println(a + " " + b);
	}
}

class XYZ extends XY {
	String color;

	void color(String color) {
		this.color = color;
	}

	void show() {
		System.out.println(a + " " + b + " " + color);
	}
}

public class Day13_2 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		XY x = new XY();
		x.set(1, 2);
		x.show(); // 1,2 출력
		XYZ xy = new XYZ();
		xy.set(4, 5);
		xy.color("blue");
		xy.show(); // 4,5,blue 출력

//		4. 두 사람이 가위바위보를 한다. 가위,바위,보 중 하나를 문자열로 입력받아 누가 이겼는지 판단하는 프로그램을작성해라.(중첩 if문 사용해야함, 문자열 비교)
//		실행결과) 영수 : 가위
//		             철수 : 보
//		              철수가 이겼다.
		String a = s.next();
		String b = s.next();
		System.out.println("영수 : " + a);
		System.out.println("철수 : " + b);

		if (a.equals("바위")) {
			if (b.equals("바위"))
				System.out.println("두 사람이 비겼다.");
			else if (b.equals("가위"))
				System.out.println("영수가 이겼다.");
			else if (b.equals("보"))
				System.out.println("철수가 이겼다.");
		} else if (a.equals("가위")) {
			if (b.equals("바위"))
				System.out.println("철수가 이겼다.");
			else if (b.equals("가위"))
				System.out.println("두 사람이 비겼다.");
			else if (b.equals("보"))
				System.out.println("영수가 이겼다.");
		} else if (a.equals("보")) {
			if (b.equals("바위"))
				System.out.println("영수가 이겼다.");
			else if (b.equals("가위"))
				System.out.println("철수가 이겼다.");
			else if (b.equals("보"))
				System.out.println("두 사람이 비겼다.");
		}
	}

}
