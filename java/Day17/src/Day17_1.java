interface Person1 {

	String work();
}

class Worker implements Person1 {
	public String work() {
		return "���Ѵ�";
	}
}
class Student implements Person1 {
	public String work() {
		return "�����Ѵ�";
	}
}
abstract class Ab{
	abstract int total(int[]a);
}

class Cd extends Ab{
	int []a;
	int hap=0;
	int total(int[] a) {
		this.a=a;
		for(int b:a) {
			hap+=b;
		}
		
		return hap;
	}
}

public class Day17_1 {

	static void pr(Person1 p) {
		System.out.println(p.work());
	}

	public static void main(String[] args) {

		pr(new Worker()); // ���Ѵ�
		pr(new Student()); // �����Ѵ� ���

		
		 Ab c=new Cd();
		 System.out.println(c.total(new int []{1,2,3,4,5}));
		
	}
}
