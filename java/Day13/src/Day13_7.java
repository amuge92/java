class ���� {
	static final int ���� = 100000;
	double ���� = 0;

	double ����() {
		return ���� = ���� * 1.001;
	}
}

class ���� extends ���� {
}

class ���� extends ���� {
	double ����() {
		return ���� = ���� * 1.002;
	}
}

public class Day13_7 {
	public static void main(String[] args) {

		���� ��Ȱ = new ����();
		���� ���� = new ����();
		���� ���� = new ����();
		���� ���� = new ����();
		���� ���� = new ����();
		���� ���[] = { ����, ��Ȱ, ����, ����, ���� };

		for (int i = 0; i < ���.length; i++) {
			System.out.println(���[i].����());
		}

	}
}
