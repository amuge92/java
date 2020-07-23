import java.util.Comparator;
import java.util.Iterator;
import java.util.TreeSet;

//class Str implements Comparable<Str> {
//	String a = "";
//	int b = 0;
//
//	Str(String a, int b) {
//		this.a = a;
//		this.b = b;
//	}
//
//	public int compareTo(Str o) {
//		if (a.equals(o.a)) {
//			return 0;
//		} else {
//			return 1;
//		}
//	}
//
//	public int hashCode() {
//		return Integer.parseInt(a);
//
//	}
//
//	public boolean equals(Object obj) {
//		Str s = (Str) obj;
//		if (s.a.equals(a)) {
//			return true;
//		}
//		return false;
//	}
//
//	public String toString() {
//		return a + "   " + b;
//	}
//}

class Str1 implements Comparable<Str1> {
	String a = "";
	int b = 0;

	Str1(int b, String a) {
		this.a = a;
		this.b = b;
	}

	public String toString() {
		return a + "   " + b;
	}

	@Override
	public int compareTo(Str1 o) {
		if (b < o.b)
			return -1;
		if (b > o.b)
			return 1;
		return 0;
	}

}

public class Day22_5 {
	public static void main(String[] args) {
//		TreeSet<Str> ts = new TreeSet<Str>();
//		ts.add(new Str("", 0));
//		ts.add(new Str("����", 11));
//		ts.add(new Str("����", 11));
//		ts.add(new Str("����1", 11));
//		ts.add(new Str("����2", 11));
//		ts.add(new Str("����1", 22));
//		ts.add(new Str("����2", 33));
//		ts.add(new Str("����", 55));
//		ts.add(new Str("����", 33));
//		ts.add(new Str("����", 333));
//		ts.add(new Str("����", 22));
//		ts.add(new Str("����", 33));

		TreeSet<Str1> ts1 = new TreeSet<Str1>();
		ts1.add(new Str1(11, "����"));
		ts1.add(new Str1(22, "����"));
		ts1.add(new Str1(33, "����"));
		ts1.add(new Str1(44, "����"));
		ts1.add(new Str1(55, "����"));
		ts1.add(new Str1(11, "����1"));
		ts1.add(new Str1(11, "����2"));
		ts1.add(new Str1(22, "����1"));
		ts1.add(new Str1(33, "����2"));
		ts1.add(new Str1(22, "����"));
		ts1.add(new Str1(33, "����"));
		ts1.add(new Str1(333, "����"));
		ts1.add(new Str1(22, "����"));
		ts1.add(new Str1(33, "����"));

//		Iterator<Str> it = ts.iterator();
//		while (it.hasNext()) {
//			System.out.println(it.next());
//		}
		Iterator<Str1> it1 = ts1.iterator();
		while (it1.hasNext()) {
			System.out.println(it1.next());
		}

	}
}
