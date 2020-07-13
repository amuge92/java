abstract class Pro {
	abstract void add(String name, String id);

	abstract String check(String id);

}

class Person {
	String name, id;

	Person(String n, String i) {
		name = n;
		id = i;
	}

	public String getname() {
		return name;
	}

	public String getid() {
		return id;
	}

}

class Per extends Pro {
	Person ary[];
	int n=0;

	Per(int n) {
		ary = new Person[n];
		n = 0;
	}

	void add(String name, String id) {
		ary[n] = new Person(name, id);
		n++;
	}

	String check(String id) {
		for (int i = 0; i < n; i++) {
			if (id.compareTo(ary[i].getid()) == 0)
				return ary[i].getname();
		}
		return null;
	}

}

public class Day15_6 {
	public static void main(String[] args) {
 
		Per p1 = new Per(4);
		p1.add("全辨1","1");
		p1.add("全辨2","12");
		p1.add("全辨3","1234");
		p1.add("全辨4","12345");
		System.out.println(p1.check("1234"));
		System.out.println(p1.check("1"));
		System.out.println(p1.check("12"));
		System.out.println(p1.check("12345"));
		
	}
}
