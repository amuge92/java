class Th extends Thread {
	String str;

	Th(String str, int n) {
		this.str = str;
		setPriority(n);// ������ �켱���� ����
	}

	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.print(str);
			System.out.println(getPriority());
			// ������ �켱���� ���� �Լ�
		}
	}
}

public class Day15_8 {
	public static void main(String[] args) {

		Th t = new Th("����", Thread.MAX_PRIORITY);
		Th t2 = new Th("�ٶ�", Thread.NORM_PRIORITY);
		Th t3 = new Th("����", Thread.MIN_PRIORITY);
		t.start();
		t2.start();
		t3.start();
		
	}
}
