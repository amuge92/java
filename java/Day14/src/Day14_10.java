class Total {
	int sum;

	Total() {
		sum = 0;
	}

	void add(int n) {
		sum += n;
	}

	int getsum() {
		return sum;
	}

}

class Add extends Total implements Runnable {
	int a, b;

	Add(int a, int b) {
		this.a = a;
		this.b = b;
	}

	public void run() {
		try {
			Thread.sleep(10);
			for (int i = a; i <= b; i++) {
				add(i);
			}
			System.out.println(getsum());
		} catch (Exception e) {
		}
	}

}

public class Day14_10 {
	public static void main(String[] args) {
		Add a1 = new Add(1, 10);
		Add a2 = new Add(1, 100);
		Thread t1 = new Thread(a1);
		Thread t2 = new Thread(a2);
		t1.start();
		t2.start();
		try {
		t1.join();
		t2.join();
		}catch(Exception e) {}
	}

}
