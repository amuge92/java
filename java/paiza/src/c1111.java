import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.Scanner;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

class Im extends JFrame {
	String[] i = { "null", "C:\\ima\\2.jpg", "C:\\ima\\3.jpg", "C:\\ima\\4.jpg", "C:\\ima\\5.jpg", "C:\\ima\\6.jpg",
			"C:\\ima\\7.jpg", "C:\\ima\\8.jpg", "C:\\ima\\9.jpg" };

	int[] rand() {
		int[] aa = new int[9];
		for (int c = 0; c < 9; c++) {
			aa[c] = (int) (Math.random() * 9);
			for (int b = 0; b < c; b++) {
				if (aa[c] == aa[b])
					--c;
			}
		}
		return aa;
	}

	Im() {
		int[] aa = rand();

		Container c = getContentPane();
		c.setLayout(new GridLayout(3, 3, 10, 10));
		ImageIcon[] im = { new ImageIcon("C:\\ima\\1.jpg"), new ImageIcon("C:\\ima\\2.jpg"),
				new ImageIcon("C:\\ima\\3.jpg"), new ImageIcon("C:\\ima\\4.jpg"), new ImageIcon("C:\\ima\\5.jpg"),
				new ImageIcon("C:\\ima\\6.jpg"), new ImageIcon("C:\\ima\\7.jpg"), new ImageIcon("C:\\ima\\8.jpg"),
				new ImageIcon("C:\\ima\\9.jpg") };
		;
		JLabel[] j = new JLabel[9];
		for (int a = 0; a < 9; a++) {
			im[a] = new ImageIcon(i[aa[a]]);
			j[a] = new JLabel(im[a]);
			c.add(j[a]);
		}
		addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				getContentPane().removeAll();
				int[] bb = rand();
				for (int a = 0; a < 9; a++) {
					im[a] = new ImageIcon(i[bb[a]]);
					j[a] = new JLabel(im[a]);
					c.add(j[a]);
				}
				validate();
			}
		});
		JMenuBar jm = new JMenuBar();
		JMenu[] jmu = new JMenu[3];
		JMenuItem ji = new JMenuItem("¿­±â");
		ji.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new Im();
			}
		});
		jmu[0] = new JMenu("Open");
		jmu[0].add(ji);
		jmu[1] = new JMenu("S");
		jmu[2] = new JMenu("L");
		for (JMenu a : jmu) {
			jm.add(a);
		}
		setJMenuBar(jm);

		setVisible(true);
		setSize(512, 512);
	}

}


public class c1111 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		new Im();
	}
}
