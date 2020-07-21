import java.awt.Container;
import java.awt.FlowLayout;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Vector;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

class A {
	private String n;
	private int i;

	A(String name, int id) {
		n = name;
		i = id;
	}

	public String getname() {
		return n;
	}

	public int getid() {
		return i;
	}

	public boolean equals(Object obj) {
		A a = (A) obj;

		if (a.getid() == this.i && a.getname().equals(this.n)) {
			return true;
		}
		return false;

	}

}

class Game {
	Scanner s = new Scanner(System.in);
	Vector<A> va = new Vector<A>();

	Game() {
		va.add(new A("��", 654));
		va.add(new A("��", 987));
		va.add(new A("��", 123));
		va.add(new A("��", 159));
	}

	void in() {
		while (true) {
			System.out.println("�̸�  ���̵� �Է�");
			String name = s.next();
			if (name.equals("stop"))
				break;
			int id = s.nextInt();
			A aa = new A(name, id);

			if (va.contains(aa)) {
				System.out.println("�̹� �ִ�.");
			} else
				va.add(aa);
		}
		System.out.println(va.size());
	}

	void out() {
		while (true) {
			int n = va.size();
			A a = va.get(n - 1);
			String str = a.getname();
			System.out.println(str + "id��?");
			int id = s.nextInt();
			if (id == a.getid()) {
				System.out.println("����");
				break;
			} else
				System.out.println("���� �ƴ�");

		}
	}

	void end() {
		System.out.println("����");
		System.exit(0);
	}
}

public class Day21_0 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		Game g = new Game();

		while (true) {
			System.out.println("1 �Է�,2 ���,3������");
			int n = s.nextInt();
			switch (n) {
			case 1:
				g.in();
				break;
			case 2:
				g.out();
				break;
			case 3:
				g.end();
				break;

			}

		}
		// HashMap<String, Integer> hm = new HashMap<String, Integer>();
//		HashSet<String> hs = new HashSet<String>();
//		hm.put("��", 123);
//		hm.put("��", 789);
//		hm.put("��", 456);
//
//		String a = s.next();
//
//		if (!hm.containsKey(a))
//			System.out.println("���� ����");
//		else
//			System.out.println(hm.get(a));
//
//		hs.add("�ٶ�");
//		hs.add("����");
//		hs.add("���");
//		Iterator<String> it = hs.iterator();
//		System.out.println(it.next());
//		System.out.println(it.next());
//		System.out.println(it.next());

	}
}

//class gugu extends JFrame {
//	gugu() {
//		Container c = getContentPane();
//		setLayout(new FlowLayout());
//		ImageIcon ima = new ImageIcon("C:\\Users\\Administrator\\Desktop\\i1.jpg");
//		
//		JLabel j1 = new JLabel(ima);
//		add(j1);
//		
//		setVisible(true);
//		setSize(512, 512);
//		
//	}
//	
//}