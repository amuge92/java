import java.io.IOException;
import java.util.Scanner;

interface Poi {
	void show(String a, int i);

	void show(String a);
}

class Point implements Poi {

	public void show(String a) {
		System.out.println(a);
	}

	public void show(String a, int b) {
		System.out.println(a + b);
	}

}

class Circle {
	double r;

	Circle(double r) {
		this.r = r;
	}

	double area() {
		return 3.14 * r * r;
	}

	public boolean equals(Object obj) {
		Circle c = (Circle) obj;
		if (r == c.r)
			return true;
		else
			return false;
	}

}

public class Day24_2 {

	public static void main(String[] args) throws IOException {
		Scanner s = new Scanner(System.in);
//		Circle c1 = new Circle(20);
//		Circle c2 = new Circle(20);
//
//		if (c1.equals(c2))
//			System.out.println("같다");
//		else
//			System.out.println("다르다");
//		System.out.println(c1.hashCode());
//		System.out.println(c2.hashCode());
//
//		Poi p = new Point();
//		p.show("방탄", 50000);
//		p.show("BTS");

		At a = new At(1, 10);
		Bt b = new Bt(11, 20);
		a.start();
		b.start();
	}
}

class At extends Thread {
	int a, b;

	At(int c, int d) {
		a = c;
		b = d;
	}

	public void run() {
		for (int i = a; i <= b; i++) {
			System.out.println(i);
	}}
}

class Bt extends Thread {
	int c, d;

	Bt(int c, int d) {
		this.c = c;
		this.d = d;
	}

	public void run() {
		for (int i = 1; i <= d; i++) {
			System.out.println(i);
		}
	}
}