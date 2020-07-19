import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JRadioButton;

class ya extends JFrame {

	ya() {
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLayout(new FlowLayout());
		Container c = getContentPane();
		JMenuBar jb = new JMenuBar();
		JMenu jm1 = new JMenu("1번 메뉴");
		JMenu jm2 = new JMenu("2번 메뉴");
		JMenu jm3 = new JMenu("3번 메뉴");
		JMenuItem ji1 = new JMenuItem("후라이드");
		JMenuItem ji2 = new JMenuItem("짜장");
		JMenuItem ji3 = new JMenuItem("냉면");
		JMenuItem ji4 = new JMenuItem("탕수");
		jb.add(jm1);
		jb.add(jm2);
		jb.add(jm3);
		jm1.add(ji1);
		jm2.add(ji2);
		jm2.add(ji4);
		jm3.add(ji3);
		setJMenuBar(jb);


		setVisible(true);
		setSize(500, 500);
	}

}

public class Day16_6 {
	public static void main(String[] args) {

		new ya();

	}
}
