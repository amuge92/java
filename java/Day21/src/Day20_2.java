import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.PopupMenu;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.ImageIcon;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;

class ima extends JFrame {
	ima() {
		setSize(200, 200);
		Container c = getContentPane();
		ImageIcon ima = new ImageIcon("C:\\ima\\1.jpg");
		JLabel jl = new JLabel(ima);
		c.add(jl);
		setVisible(true);
	}
}

class me extends JFrame {
	ima i1;

	me() {
		setSize(512, 512);
		setLayout(new FlowLayout());
		Container c = getContentPane();
		JMenuBar jm = new JMenuBar();
		JMenu m1 = new JMenu("Load");
		JMenu m2 = new JMenu("Hide");
		JMenu m3 = new JMenu("Exit");
		ImageIcon ima = new ImageIcon("C:\\ima\\1.jpg");
		JLabel jl = new JLabel(ima);
		jl.setVisible(false);
		c.add(jl);
		m1.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				i1 = new ima();
				jl.setVisible(true);
			}
		});
		jm.add(m1);
		m2.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {

				i1.setVisible(false);
				jl.setVisible(false);
			}
		});
		jm.add(m2);
		m3.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				System.exit(0);

			}
		});
		jm.add(m3);
		setJMenuBar(jm);
		setVisible(true);

	}

}

public class Day20_2 {
	static int[] make() {
		int make[] = { 0, 1, 2, 3, 4 };

		return make;

	}

	public static void main(String[] args) {
		new me();

		int ary[];
		ary = make();
		for (int i = 0; i < ary.length; i++) {
			System.out.println(ary[i] + " ");
		}
//		0 1 2 3 4 Ãâ·Â
	}
}
