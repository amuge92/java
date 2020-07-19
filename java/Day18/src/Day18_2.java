import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;

class con2 extends JFrame {
	con2() {
		Container c = getContentPane();
		setLayout(new FlowLayout());
		JRadioButton jb1 = new JRadioButton("magenta");
		jb1.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				if (e.getStateChange() == ItemEvent.SELECTED) {
					jb1.setBackground(Color.magenta);
				}
				if (e.getStateChange() == ItemEvent.DESELECTED) {
					jb1.setBackground(Color.cyan);
				}
			}
		});
		JRadioButton jb2 = new JRadioButton("red");
		jb2.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				if (e.getStateChange() == ItemEvent.SELECTED) {
					jb2.setBackground(Color.red);
				}
				if (e.getStateChange() == ItemEvent.DESELECTED) {
					jb2.setBackground(Color.cyan);
				}
			}
		});
		add(jb1);
		add(jb2);

		JLabel jl = new JLabel("하이");
		jl.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				jl.setText("안녕");
			}
		});

		add(jl);
		setVisible(true);
	}

}

class Book {
	String a;
	int b = 40000;

	Book(String a) {
		this.a = a;
	}

	Book(String a, int b) {
		this.a = a;
		this.b = b;
	}

	void title() {
		System.out.println(a + " " + b + "원");
	}
}

public class Day18_2 {
	public static void main(String[] args) {
		new con2();

		Book b1 = new Book("자바");
		b1.title(); // 자바는 40000원
		Book b2 = new Book("파이썬", 30000);
		b2.title(); // 파이썬 30000원

	}
}
