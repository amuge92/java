import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

class Person {
	int a;
	String n;

	Person(int a, String n) {
		this.a = a;
		this.n = n;
	}
	public int hashCode(){
		return a;
	}
	public boolean equals(Object obj) {
		Person p = (Person) obj;
		return a==p.a;
	}

}

public class Day20_3 {
	static int add(int[] a, int i) {
		int y = 0;
		for (int x = 0; x < i; x++) {

			y += a[x];
		}
		return y;
	}

	static int add(int[] a, int i, int[] b) {
		int y = 0;
		for (int x = 0; x < i; x++) {
			y += a[x];
		}
		for (int x = 0; x < b.length; x++) {
			y += b[x];
		}
		return y;
	}

	public static void main(String[] args) {
		Set<Person> s = new HashSet<Person>();

		s.add(new Person(12, "È«±æµ¿"));
		s.add(new Person(23, "±è±æµ¿"));
		s.add(new Person(12, "ÀÌ±æµ¿"));
		Iterator<Person> it = s.iterator();

		while (it.hasNext()) {
			Person p = it.next();
			System.out.println(p.a + " " + p.n);
		}

			int a[] = { 1, 2, 3, 4, 5 };
			int b[] = { 6, 7, 8, 9, 10 };
			int c = add(a, 5);
			int d = add(a, 5, b);
			System.out.println(c);
			System.out.println(d);

	}
}
