import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.JTextPane;

class Profile {
	String id;
	int age;

	Profile(String i, int a) {
		id = i;
		age = a;
	}

	public String toString() {
		return id + " " + age;
	}

}

public class Day20_1 {
	public static void main(String[] args) throws Exception {
		Scanner s = new Scanner(System.in);
//		ArrayList<Profile> ap = new ArrayList<>();
//		ap.add(new Profile("가나다", 123));
//		ap.add(new Profile("라마바", 456));
//		ap.add(new Profile("사아자", 789));
//
//		for (int i = 0; i < ap.size(); i++) {
//			System.out.println(ap.get(i));
//		}
//		Iterator<Profile> ip = ap.iterator();
//
//		System.out.println("사각형의 너비와 높이를 입력하라");
//		while (true) {
//			try {
//				int w = s.nextInt();
//				int h = s.nextInt();
//				Rectangle r = new Rectangle();
//				r.set(w, h);
//				System.out.println(r.geth() * r.getw());
//				break;
//			} catch (Exception e) {
//				System.out.println("정수 입력");
//				s.next();
//				continue;
//			}
//
//		}

		System.out.println("인원수 입력");
		int ino = s.nextInt();
		Profile1[] p1 = new Profile1[ino];
		for (int i = 0; i < ino; i++) {
			p1[i] = new Profile1(s.next(), s.next());
			System.out.println(p1[i].getname() + " " + p1[i].getid());
		}
		new gu10();
	}
}

class gu10 extends JFrame {
	gu10() {
		setVisible(true);
		Container c = getContentPane();
		setLayout(new FlowLayout());

		JTextArea ja = new JTextArea(1, 10);
		JTextField jfi = new JTextField(10);
		JPasswordField jfp = new JPasswordField(10);
		jfp.setEchoChar('p');
		JLabel lai = new JLabel("ID");
		JLabel lap = new JLabel("PASSWORD");

		jfi.addKeyListener(new KeyAdapter() {
			public void keyReleased(KeyEvent e) {
				int as = e.getKeyCode();
				if (as == KeyEvent.VK_ENTER) {
					String str = jfi.getText();
					ja.setText(ja.getText() + str);
					jfi.setText("");
				}

			}
		});

		c.add(lai);
		c.add(jfi);
		c.add(lap);
		c.add(jfp);

		c.add(ja);

	}
}

class Profile1 {

	String name, id;

	Profile1(String name, String id) {

		this.name = name;
		this.id = id;

	}

	String getname() {
		return name;
	}

	String getid() {
		return id;
	}

}

class Rectangle {
	private int w, h;

	void set(int w, int h) {
		this.w = w;
		this.h = h;
	}

	int getw() {
		return w;
	}

	int geth() {
		return h;
	}
}
