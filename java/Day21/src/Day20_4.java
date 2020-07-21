import java.awt.Color;
import java.awt.Container;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JFrame;
import javax.swing.JLabel;

class ru implements Runnable {
	public void run() {

		try {
			Thread.sleep(10000);
			System.exit(0);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}

class ac extends MouseAdapter {

	@Override
	public void mouseClicked(MouseEvent e) {
		int r = (int) (Math.random() * 256);
		int g = (int) (Math.random() * 256);
		int b = (int) (Math.random() * 256);
		JLabel j = (JLabel) e.getSource();
		j.setBackground(new Color(r, g, b));
	}

}

class gri extends JFrame {

	gri() {
		setLayout(new GridLayout(4, 3));
		JLabel[] j = new JLabel[12];
		Container c = getContentPane();
		for (int i = 0; i < 12; i++) {
			j[i]=new JLabel();
			j[i].setOpaque(true);
			j[i].setBackground(Color.WHITE);
			j[i].addMouseListener(new ac());
			c.add(j[i]);
		}
		setVisible(true);
	}

}

public class Day20_4 {
	public static void main(String[] args) {
		new gri();
//		ru r = new ru();
//		Thread t = new Thread(r);
//		t.start();
	}
}
