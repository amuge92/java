import java.util.Scanner;

import javax.swing.JFrame;


class Name {

	private String name;
	private int age;

	Name(String n, int a) {
		name = n;
		age = a;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}
}

class Book1 {
	String a;
	String b = "CSS";

	Book(String a, String b) {
		this.a = a;
		this.b = b;
	}

	Book(String a) {
		this.a = a;
	}

	void show() {
		System.out.println(a + " " + b);

	}

}

public class Day15_0 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		// �̸��� ���̸� �Է¹޾� ���
		Name n = new Name(s.next(), s.nextInt());
		System.out.println(n.getAge() + n.getName());

		Book b1 = new Book("�ڹ�", "DB");
		Book b2 = new Book("HTML");
		// �ڹ� db
		// html CSS
		b1.show();
		b2.show();
		
		Double a1 = new Double(10.5);
		double a2 = a1.doubleValue()
		
		

	}
}
