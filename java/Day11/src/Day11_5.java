class AAA {
	void ride() {
		System.out.println("�������̵�AA");
	}

	void load() {

		System.out.println("�����ε�AA");
	}

}

class BB extends AAA {
	void ride() {// ���� ���̵�
		System.out.println("�������̵�BB");
	}

	void load(int n) {// �����ε�

		System.out.println("�����ε�BB");
	}

}

public class Day11_5 {
	public static void main(String[] args) {

		AAA a = new AAA();
		BB b = new BB();
		a.ride();
		a.load();
		b.ride();
		b.load();
		b.load(1);

	}
}
