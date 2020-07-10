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
	// Person p =new Student(); 업캐스팅
	static void show(Person p) {
		if (p instanceof Person) {
			System.out.println("사람");
		}
		if (p instanceof Student) {
			System.out.println("학생");
		}
		if (p instanceof Worker) {
			System.out.println("워커");
		}
		if (p instanceof ITWorker) {
			System.out.println("아이티");
		}
	}

	public static void main(String[] args) {
		show(new Student());
		show(new Worker());
		show(new ITWorker());

	}
}
