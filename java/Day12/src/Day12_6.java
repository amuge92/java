abstract class A {
	abstract void aa();

	void run() {
		System.out.println("���� �����δ�.");
	}
}

class B extends A {
	void bb() {
	}

	void aa() {

	}
}

//�߻� Ŭ�����ȿ��� �Ϲ����� �޼ҵ�, �߻� �޼ҵ� �Ѵ� ����
//�߻� �޼ҵ�� �ݵ�� �߻�Ŭ���� �ȿ� �־�� �Ѵ�.
public class Day12_6 {
	public static void main(String[] args) {

		
		B b = new B();
		b.run();
	}
}
