class Person {
	int p;
}

class Student extends Person {
	int a;
}

class Worker extends Person {
	int a;
}

class ITWorker extends Worker {
	int b;
}

public class Day13_5 {
	// Person p =new Student(); ��ĳ����
	static void show(Person p) {
		if (p instanceof Person) {
			System.out.println("���");
		}
		if (p instanceof Student) {
			System.out.println("�л�");
		}
		if (p instanceof Worker) {
			System.out.println("��Ŀ");
		}
		if (p instanceof ITWorker) {
			System.out.println("����Ƽ");
		}
	}

	public static void main(String[] args) {
		show(new Student());
		show(new Worker());
		show(new ITWorker());

	}
}
