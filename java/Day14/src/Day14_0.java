import java.util.Arrays;

interface IT {
	void java();
}

class Student {
	public void study(IT it) {
		it.java();
	}

}

class ITStudent implements IT {
	public void java() {
		System.out.println("�ڹ� ����");
	}

}

class DBStudent implements IT {
	public void java() {
		System.out.println("������ ���̽� ����");
	}

}

public class Day14_0 {
	public static void main(String[] args) {

		Student sd = new Student();
		ITStudent it1 = new ITStudent();
		DBStudent db = new DBStudent();
		sd.study(it1);

		Integer i1 = 100; // ���� �ڽ� integer i new integer(100);
		int n = i1; // ���� ��ڽ�

		Integer i = new Integer(10);
		// ���� 'a'��üȭ
		// �Ҹ��� true ��üȭ��
		Boolean d = new Boolean(true);
		d = d.booleanValue();
		Character e = new Character('a');
				e = e.charValue();
	
	}
}
