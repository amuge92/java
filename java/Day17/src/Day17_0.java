import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Scanner;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

class gu extends JFrame {
	gu() {
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setBackground(Color.blue);
		setLayout(new FlowLayout());
		JButton bt1 = new JButton("오케이");
		bt1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				c.setBackground(Color.orange);
			}
		});
		JButton bt2 = new JButton("캔슬");
		bt2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				bt2.setEnabled(false);
			}
		});
		JButton bt3 = new JButton("겟");

		bt3.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				System.out.println(e.getX() + " " + e.getY());
			}
		});

		add(bt1);
		add(bt2);
		add(bt3);

		setVisible(true);
		setSize(500, 500);

	}
}

class Person implements Serializable{
	transient String a; //직렬화 대상에서 제외.
	String b;
	int c, d;

	Person(String a, String b, int c, int d) {
		this.a = a;
		this.b = b;
		this.c = c;
		this.d = d;
	}

	void show() {
		System.out.println(a + " " + b + " " + c + " " + d);
	}
}

class Circle {

	private double x, y;

	private int r;

	Circle(double x, double y, int r) {

		this.x = x;
		this.y = y;
		this.r = r;
	}

	void show() {

		System.out.println(x + " " + y + " " + r);
	}
}

public class Day17_0 {
	public static void main(String[] args) throws IOException, ClassNotFoundException{
		Scanner s = new Scanner(System.in);
//		new gu();

		Boolean.toString(false);
		double d = Double.parseDouble("36.5");
		int i = Integer.parseInt("35");

		
		ObjectOutputStream oo = new ObjectOutputStream(new FileOutputStream("pp.txt"));
		Person p = new Person("Jack", "computer", 20, 123);
		oo.writeObject(p);
		oo.close();
		ObjectInputStream oi = new ObjectInputStream(new FileInputStream("pp.txt"));
		p=(Person) oi.readObject();
		p.show();
		oi.close();
		
		Circle[] a =new Circle[3];
		for(Circle b:a) {
			b=new Circle(s.nextDouble(),s.nextDouble(),s.nextInt());
			b.show();
		}
		

	}
}
