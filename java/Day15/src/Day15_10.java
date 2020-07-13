class Cal2 {
	int cnt = 0;

	int add(int a, int b) {
		cnt++;
		return a + b;
	}

	int sub(int a, int b) {
		cnt++;
		return a - b;
	}

	void show() {
		System.out.println("¿¬»ê È½¼ö" + cnt);
	}
}

class Add extends Thread {
	Cal2 c;

	Add(Cal2 c) {
		this.c = c;
	}

	public void run() {
	System.out.println(c.add(10, 20));
	}
}

class Sub extends Thread {
	Cal2 c;

	Sub(Cal2 c) {
		this.c = c;
	}

	public void run() {
		System.out.println(c.sub(10, 20));
	}
}

public class Day15_10 {
	public static void main(String[] args) {
		Cal2 c = new Cal2();
		Add a = new Add(c);
		Sub s = new Sub(c);

		a.start();
		s.start();
		try {
			a.join();
			s.join();
			c.show();
		} catch (Exception e) {
		}
	}
}
