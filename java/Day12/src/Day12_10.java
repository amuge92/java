interface Car {

	int CAR_COUNT = 0;

	void work();

	default int num() {
		return 0;
	};
}

class Sedan implements Car {
	public/* �ۺ� �ʼ� */ void work() {
		System.out.println("�¿����� ����� �¿�� �ֽ��ϴ�.");
	}

}

class Truck implements Car {
	public void work() {
		System.out.println("Ʈ���� ���� �ư� �ֽ��ϴ�.");

	}
}

public class Day12_10 {
	public static void main(String[] args) {
//�������̽��� �⺻ ��������(�߻�޼ҵ�, �����(final))
//�޼ҵ带 �����Ϸ��� �޼ҵ� �տ� default
//�������̽� �ȿ� abstract��� Ű���带 ����� ������ �߻�޼ҵ�� �ν��Ѵ�.
		Sedan s = new Sedan();
		Truck t = new Truck();
		s.work();
		t.work();

	}
}
