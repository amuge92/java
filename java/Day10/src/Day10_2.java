
class Book {

	String title;
	int price;

	void show() {
		System.out.println(title + " " + price);

	}

	Book() {
		this("", 0);
		System.out.println("������ ȣ��");

	}

	Book(String title) {
		this(title, 0);// �ٸ������� ȣ��
	}

	Book(String title, int price) {
		this.title = title;
		this.price = price;
	}

}

public class Day10_2 {
	public static void main(String[] args) {

		Book b = new Book("�����", 30000);
		Book b1 = new Book("�Ű�");
		Book b2 = new Book();

	}
}
