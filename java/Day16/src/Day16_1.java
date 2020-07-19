import java.util.Scanner;

interface Cal {
	int total(int a, int b); // a부터 b까지의 합 리턴

	int big(int a, int b); // a,b중 큰 값 리턴
}

class Calcu implements Cal {
	public int total(int a, int b) {
		int hap = 0;
		for (int i = a; i <= b; i++) {
			hap += i;
		}
		return hap;
	}

	public int big(int a, int b) {
		return Math.max(a, b);
	}
}

class Th implements Runnable {
	String a;

	Th(String a) {
		this.a = a;
	}

	public void run() {
		System.out.println(a);
	}

}

class Timer extends Thread {
	public void run() {
		try {
			sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}

class AThread extends Thread {
	AThread(Total t, int a, int b) {
		for (int i = a; i <= b; i++) {
			t.total(i);
		}

	}
}

class Total {
	int sum;

	Total() {
		sum = 0;
	}

	void total(int n) {
		sum += n;
	}

	int get() {
		return sum;
	}
}

interface Figure {
	void circle_area();

	void rec_area();
}

class Circle implements Figure {
	int r;

	Circle(int a) {
		r = a;
	}

	public void circle_area() {
		System.out.println(r * r * 3.14);
	}

	@Override
	public void rec_area() {
		// TODO Auto-generated method stub
		
	}
}

class Rec implements Figure {
	int h, w;

	Rec(int a, int b) {
		h = a;
		w = b;
	}

	public void rec_area() {
		System.out.println(h * w);
	}

	@Override
	public void circle_area() {
		// TODO Auto-generated method stub
		
	}
}

public class Day16_1 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		Th t = new Th("쓰레드 1");
		Thread th = new Thread(t);
		th.start();

		Timer t1 = new Timer();
		t1.start();

		Total t2 = new Total();
		AThread a = new AThread(t2, 1, 50);
		AThread b = new AThread(t2, 51, 100);

		try {
			a.start();
			a.join();
			b.start();
			System.out.println(t2.get());

		} catch (Exception e) {
		}

		Figure f1 = new Circle(5);
		Figure f2 = new Rec(2, 5);
		f1.circle_area();
		f2.rec_area();
	}

}
