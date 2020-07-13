class Th extends Thread {
	String str;

	Th(String str, int n) {
		this.str = str;
		setPriority(n);// 스레드 우선순위 세팅
	}

	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.print(str);
			System.out.println(getPriority());
			// 쓰레드 우선순위 얻어내는 함수
		}
	}
}

public class Day15_8 {
	public static void main(String[] args) {

		Th t = new Th("가나", Thread.MAX_PRIORITY);
		Th t2 = new Th("다라", Thread.NORM_PRIORITY);
		Th t3 = new Th("마바", Thread.MIN_PRIORITY);
		t.start();
		t2.start();
		t3.start();
		
	}
}
