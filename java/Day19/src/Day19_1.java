import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;

class jt implements ActionListener {
	public void actionPerformed(ActionEvent e) {

		int r = JOptionPane.showConfirmDialog(null, "정말로 종료?", "툴바", JOptionPane.YES_NO_CANCEL_OPTION);
		if (r == JOptionPane.CLOSED_OPTION) {
			return;
		} else if (r == JOptionPane.YES_OPTION) {
			System.exit(0);
		}
	}
}

class gu1 extends JFrame {
	gu1() {
		setVisible(true);
		setSize(512, 512);
		JMenuBar jb = new JMenuBar();
		setJMenuBar(jb);
		JMenu jm1 = new JMenu("Search");
		JMenu jm2 = new JMenu("Project");
		JMenuItem ji1 = new JMenuItem("Open");
		JMenuItem ji2 = new JMenuItem("Open File");
		ji1.addActionListener(new jt());
		jm2.add(ji1);
		jm2.add(ji2);
		jb.add(jm1);
		jb.add(jm2);

	}

}

public class Day19_1 {
	public static void main(String[] args) {
		new gu1();
	}
}
