
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

		Music m = new Music("���� ���");
		Movie m1 = new Movie("��ȭ ���");
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
		 * ���. join() synchronized(���� �Ǵ�) �ϳ��� �޼ҵ忡 �������� �����尡 �����Ҵ�, �޼ҵ带 ��״� �۾�.
		 * wait(),notidy()
		 * 
		 * )
		 */

	}
}
