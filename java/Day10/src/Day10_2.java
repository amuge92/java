
class Book {

	String title;
	int price;

	void show() {
		System.out.println(title + " " + price);

	}

	Book() {
		this("", 0);
		System.out.println("생성자 호출");

	}

	Book(String title) {
		this(title, 0);// 다른생성자 호출
	}

	Book(String title, int price) {
		this.title = title;
		this.price = price;
	}

}

public class Day10_2 {
	public static void main(String[] args) {

		Book b = new Book("고양이", 30000);
		Book b1 = new Book("신곡");
		Book b2 = new Book();

	}
}
