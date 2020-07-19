import java.awt.Color;
import java.awt.Container;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

import javax.swing.JFrame;

class Mouse3 extends MouseAdapter implements MouseMotionListener {
	public void mouseDragged(MouseEvent e) {
		Container c = (Container) e.getSource();
		c.setBackground(Color.yellow);
	}

	public void mouseReleased(MouseEvent e) {
		Container c = (Container) e.getSource();
		c.setBackground(Color.black);
	}
}

class Gu1 extends JFrame {
	Gu1() {
		Mouse3 m3 = new Mouse3();
		
		setTitle("ÀÚ¹Ù");

		Container c = getContentPane();
		c.addMouseListener(m3);
		c.addMouseMotionListener(m3);
//		c.setBackground(Color.cyan);
//		c.addMouseListener(new MouseAdapter() {
//			public void mouseReleased(MouseEvent e) {
//				c.setBackground(Color.cyan);
//			}
//		});
//		c.addMouseMotionListener(new MouseMotionListener() {
//			public void mouseMoved(MouseEvent e) {
//			}
//
//			public void mouseDragged(MouseEvent e) {
//				c.setBackground(Color.magenta);
//
//			}
//		});

		setVisible(true);
		setSize(512, 512);

	}
}

public class DAy16_4 {
	public static void main(String[] args) {
		new Gu1();
	}
}
