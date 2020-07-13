
class Music extends Thread {
	String m;

	Music(String m) {
		this.m = m;
	}

	public void run() {
		try {

			for (int i = 0; i < 10; i++) {
				System.out.println(m);
			}
		} catch (Exception e) {
		}
	}

}

class Movie implements Runnable {
	String m;
	Movie(String m) {
		this.m = m;
	}

	public void run() {
		try {
			for (int i = 0; i < 10; i++) {
				System.out.println(m);
			}
		} catch (Exception e) {
		}
	}
}

public class Day15_7 {
	public static void main(String[] args) {

		Music m = new Music("음악 재생");
		Movie m1 = new Movie("영화 재생");
		Thread t =  new Thread(m1);
		m.start();
		t.start();
		
		
		try {
			m.join();
			t.join();
		}catch(Exception e) {}
		// start()=>run()
		/*
		 * a.start();
		 * 
		 * 잠금. join() synchronized(락을 건다) 하나의 메소드에 여러개의 쓰레드가 접근할대, 메소드를 잠그는 작업.
		 * wait(),notidy()
		 * 
		 * )
		 */

	}
}
