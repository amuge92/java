
//class Car extends Thread {
//
//	String name;
//
//	public Car(String name) {
//		this.name = name;
//
//	}
//
//	public void run() {
//		for (int i = 0; i < 3; i++) {
//
//			try {
//				Thread.sleep(10);
//
//				System.out.println(name + "�޸��ϴ�.");
//			} catch (Exception e) {
//			}
//			;
//
//		}
//
//	}
//
//}

public class Day9_3 {
	public static void main(String[] args) {

		int[] s = { 9, 3, 7, 2, 5 };
		int temp;
		for (int i = 0; i < (s.length - 1); i++) {
			for (int j = i + 1; j < s.length;j++) {
				if (s[i] > s[j]) {
					temp = s[j];
					s[j] = s[i];
					s[i] = temp;
				}

			}
		}
		for (int i = 0; i < s.length; i++) {
			System.out.print(s[i] + "  ");
		}
//		Car car1 = new Car("�ڵ���1111");
//		Car car2 = new Car("�ڵ���@@@@");
//		Car car3 = new Car("�ڵ���3##3");
//
//		car2.start();
//		car1.start();
//		car3.start();

	}
}
