class Th extends Thread {
	String str;

	Th(String str) {
		this.str = str;
	}

	public void run() {
		// 쓰레드의 메인메소드
		for (int i = 0; i < 10; i++) {
			System.out.println(str);
			try {
				sleep(100);
			} catch (Exception e) {

			}
		}

	}

}
class Th1 implements Runnable {
	String str;
	
	Th1(String str) {
		this.str = str;
	}
	
	public void run() {
		// 쓰레드의 메인메소드
		for (int i = 0; i < 10; i++) {
			System.out.println(str);
			try {
				Thread.sleep(100);
			} catch (Exception e) {
				
			}
		}
		
	}
	
}

public class Day14_9 {
	public static void main(String[] args) {
		// 쓰레드 생성 두가지 방법
//1. Thread클래스 상속해서 생성
//2. Runnable 인터페이스를 상속해서 생성

		Th t = new Th("아");
		Th t1 = new Th("야");
		t.start();
		t1.start();
		Thread t2 = new Thread(new Th1("어"));
		Thread t3 = new Thread(new Th1("여"));
		t2.start();
		t3.start();
	}
}
