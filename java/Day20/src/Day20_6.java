import java.awt.FlowLayout;
import java.util.Iterator;
import java.util.TreeSet;
import java.util.Vector;

import javax.swing.JComboBox;
import javax.swing.JFrame;

class My {
	String name;
	int age;

	My(String n, int a) {
		name = n;
		age = a;
	}

	public String toString() {
		return name + " " + age;
	}
}

class Me implements Comparable<Me> {
	String n;

	Me(String name) {
		n = name;
	}

	String get() {
		return n;
	}

	public int compareTo(Me o) {// 오름차순
		if (n.length() > o.n.length())// 비교연산자 바꾸면 내림차순
			return 1;
		else if (n.length() < o.n.length())
			return -1;
		return 0;
	}
public String toString (){
	return n;
}
}

class com extends JFrame {
	com() {
		setVisible(true);
		setLayout(new FlowLayout());
		Vector<My> vt = new Vector<My>();

		vt.add(new My("지혜", 20));
		vt.add(new My("준호", 22));
		vt.add(new My("원영", 23));

		JComboBox co = new JComboBox(vt.toArray());
		JComboBox co1 = new JComboBox(vt);
		add(co);
		add(co1);
	}
}

public class Day20_6 {
	public static void main(String[] args) {
//		new com();
		TreeSet<Me> t = new TreeSet<Me>();
		t.add(new Me("슬기"));
		t.add(new Me("가나다"));
		t.add(new Me("가나다라마바사"));
		t.add(new Me("가나다라"));
		t.add(new Me("가"));
		Iterator<Me> im = t.iterator();
		while (im.hasNext()) {
			System.out.println(im.next());
		}

	}
}
