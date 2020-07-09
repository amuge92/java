class Person {

	private String name;

	Person(String name) {
		this.name = name;
	}

	void name() {
		System.out.println(name);
	}

}

class Student extends Person {
	private String major;
	private String school;

	Student(String name, String major, String school) {
		super(name);
		this.major = major;
		this.school = school;
	}

	void show() {
		System.out.println(major);
		System.out.println(school);
		super.name();
	}
}

public class Day11_4 {
	public static void main(String[] args) {

		Person p = new Person("����");
		Student s = new Student("����", "�濵", "�İ�");

		s.name();
		s.show();

	}
}
