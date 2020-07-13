import java.util.Scanner;

//class Book {
//	String a = "";
//	String b = "";
//
//	Book(String a, String b) {
//		this.a = a;
//		this.b = b;
//	}
//
//	Book(String a) {
//		this.a = a;
//		b = "작가 미상";
//	}
//
//	Book() {
//		System.out.println("생성자 호출");
//	}
//
//	void show() {
//		System.out.println(a + " " + b);
//	}
//
//}

class Friend {
	private String name;
	private String phone;

	Friend(String name, String phone) {
		this.name = name;
		this.phone = phone;
	}

	String get() {
		return name + " " + phone;
	}
}

class ITFriend extends Friend {
	String com;
	ITFriend(String name, String phone) {
		super(name, phone);
	}
	ITFriend(String name, String phone, String com) {
		super(name, phone);
		this.com = com;
	}
	void show() {
		System.out.println(get() + " " + com);
	}

}

public class Day15_2 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		ITFriend it = new ITFriend("홍길동", "010-111-1111", "컴퓨터");
		it.show();

//		Book b1 = new Book("멋진 신세계", "올더스 헉슬리");
//		Book b2 = new Book("더 해빙");
//		Book b3 = new Book();
//		b1.show();
//		b2.show();
//		b3.show();
	}
}
