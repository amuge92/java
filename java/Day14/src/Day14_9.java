class Th extends Thread {
	String str;

	Th(String str) {
		this.str = str;
	}

	public void run() {
		// �������� ���θ޼ҵ�
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
		// �������� ���θ޼ҵ�
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
		// ������ ���� �ΰ��� ���
//1. ThreadŬ���� ����ؼ� ����
//2. Runnable �������̽��� ����ؼ� ����

		Th t = new Th("��");
		Th t1 = new Th("��");
		t.start();
		t1.start();
		Thread t2 = new Thread(new Th1("��"));
		Thread t3 = new Thread(new Th1("��"));
		t2.start();
		t3.start();
	}
}
