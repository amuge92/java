import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

class Mouse extends MouseAdapter {

	public void mouseClicked(MouseEvent e) {
		System.out.println("���콺 Ŭ��");
	}
}

class Mouse2 implements MouseMotionListener {

	public void mouseDragged(MouseEvent e) {
		System.out.println(e.getX() + " " + e.getY());
	}

	public void mouseMoved(MouseEvent e) {
		System.out.println(e.getX() + " " + e.getY());
	}
}

public class Day16_3 {
	public static void main(String[] args) {
//MouseAdapterŬ����  ���콺�׼Ǹ����� ó�� 5�� �̺�Ʈ ���� ����� �ʿ� ����.

		JFrame f = new JFrame();
		f.setLayout(new FlowLayout());
		MouseListener m = new Mouse();
		MouseMotionListener m1 = new Mouse2();

		JButton bt1 = new JButton("��ư1");
		JButton bt2 = new JButton("��ư2");
		bt1.addMouseListener(m);
		f.add(bt1);
		bt2.addMouseMotionListener(m1);
		f.add(bt2);

		f.setVisible(true);
		f.setSize(512, 512);

	}
}
