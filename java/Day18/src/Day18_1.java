import java.awt.Color;
import java.awt.Container;

import javax.swing.JFrame;

public class Day18_1 extends JFrame {
	Day18_1() {
		setVisible(true);
		Th t = new Th();
		t.start();
		setSize(512, 512);
	}

	class Th extends Thread {

		public void run() {
			Container c = getContentPane();

			c.setBackground(Color.cyan);
			for (;;) {
				try {
					sleep(500);
				} catch (Exception e) {
					return;
				}
				c.setBackground(Color.getHSBColor((float) Math.random() * 300, (float) Math.random() * 300,
						(float) Math.random() * 300));
			}
		}
	}

	public static void main(String[] args) {
		new Day18_1();
	}
}
