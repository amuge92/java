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

	public int compareTo(Me o) {// ��������
		if (n.length() > o.n.length())// �񱳿����� �ٲٸ� ��������
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

		vt.add(new My("����", 20));
		vt.add(new My("��ȣ", 22));
		vt.add(new My("����", 23));

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
		t.add(new Me("����"));
		t.add(new Me("������"));
		t.add(new Me("�����ٶ󸶹ٻ�"));
		t.add(new Me("�����ٶ�"));
		t.add(new Me("��"));
		Iterator<Me> im = t.iterator();
		while (im.hasNext()) {
			System.out.println(im.next());
		}

	}
}
