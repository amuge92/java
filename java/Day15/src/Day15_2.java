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
//		b = "�۰� �̻�";
//	}
//
//	Book() {
//		System.out.println("������ ȣ��");
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

		ITFriend it = new ITFriend("ȫ�浿", "010-111-1111", "��ǻ��");
		it.show();

//		Book b1 = new Book("���� �ż���", "�ô��� �佽��");
//		Book b2 = new Book("�� �غ�");
//		Book b3 = new Book();
//		b1.show();
//		b2.show();
//		b3.show();
	}
}
