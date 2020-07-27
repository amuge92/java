package Test;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Scanner;

import javax.swing.JButton;
import javax.swing.JFrame;

class Circle {
	private double r;

	Circle(double r) {
		this.r = r;
	}

	double area() {
		return 3.14 * r * r;
	}
}

//3
class Num {
	int n;
	int max = 0;
	int add = 0;
	Num() {
		n = 0;
		if (max < n)
			max = n;

	}

	Num(int n) {
		this.n = n;
		add = add + n;
		if (max < n)
			max = n;

	}

	void add(int n) {
		add = add + n;
		if (max < n)
			max = n;
	}

	int getSum() {
		return add;
	}

	int getMax() {
		return max;
	}
}

public class JavaTest {
	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
		Scanner s = new Scanner(System.in);
		// 1
		System.out.print("두 정수를 입력: ");
		int a = s.nextInt(), b = s.nextInt();

		System.out.println("합은 " + (a + b));

		// 2
		Circle[] c = new Circle[5];
		double cc = 0;
		for (Circle c1 : c) {
			System.out.println("원의 반지름 입력");
			c1 = new Circle(s.nextDouble());
			cc = cc + c1.area();
		}
		System.out.println("5개의 원의 면적의 합 " + cc);

		// 3
		Num nb = new Num();
		nb.add(7);
		nb.add(-1);
		nb.add(20);
		nb.add(5);// 4개의 숫자를 입력
		System.out.println("Sum = " + nb.getSum());// 4개의 숫자 합계
		System.out.println("Max = " + nb.getMax());// 4개 숫자 중 최대값

		Num nb2 = new Num(10);
		System.out.println("Sum = " + nb2.getSum());
		System.out.println("Max = " + nb2.getMax());

		// 4
		HashMap<String, Integer> hm = new HashMap<String, Integer>();
		hm.put("김길동", 123);
		hm.put("박길동", 456);
		System.out.println("이름을 입력");
		String str = s.next();
		if (hm.containsKey(str)) {
			System.out.println(hm.get(str));
		}

		// 5
		new Gui();

		// 6
		Student s1 = new Student("jack", "123", 20);
		s1.show();

		ObjectOutputStream oo = new ObjectOutputStream(new FileOutputStream("java.txt"));
		oo.writeObject(s1);
		oo.close();

		ObjectInputStream oi = new ObjectInputStream(new FileInputStream("java.txt"));
		Student d = (Student) oi.readObject();
		d.show();
		oi.close();

	}
}

//5
class Gui extends JFrame {
	Gui() {
		setTitle("Dial");
		Container c = getContentPane();
		c.setLayout(new GridLayout(3, 3));
		JButton[] bt = new JButton[9];
		int i = 0;
		for (JButton b : bt) {
			b = new JButton(String.valueOf(i + 1));
			i++;
			c.add(b);

		}

		setVisible(true);
		setSize(200, 200);
	}
}

//6

class Student implements Serializable {
	String a, b;
	int c;

	Student(String a, String b, int c) {
		this.a = a;
		this.b = b;
		this.c = c;
	}

	void show() {
		System.out.println(a +" "+ b +" "+ c);
	}
}
