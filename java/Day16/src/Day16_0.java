import java.util.Scanner;

class Cook {
	String food;
	boolean send = false;// ���� ���� ������ �ȵ�.

	void set(String f) {
		food = f;// �ʱ�ȭ �ڵ�
		send = true;
		synchronized (this) {
			notifyAll();// ���ڰ� �ִ� �����带 �� �����.
		}
	}

	String get() {
		if (send == false) {
			try {
				synchronized (this) {
					wait();

				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return food;
	}
}

class Chef extends Thread {
	Cook c = new Cook();

	Chef(Cook c) {
		this.c = c;

	}

	public void run() {
		c.set("����");
	}
}

class Custumer extends Thread {
	Cook c;

	Custumer(Cook c) {
		this.c = c;
	}

	public void run() {
		System.out.println(c.get());
	}
}

public class Day16_0 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		Cook c = new Cook();
		Custumer ct1 = new Custumer(c);
		Custumer ct2 = new Custumer(c);
		Chef ch = new Chef(c);
		try {
			ct1.start();
			ct2.start();
			Thread.sleep(1000);
			ch.start();
			
			ct1.join();
			ct2.join();
			ch.join();
			
		} catch (Exception e) {
		}
	}
}
