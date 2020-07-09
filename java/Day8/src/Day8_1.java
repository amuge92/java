import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.Scanner;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.JToggleButton;
import javax.swing.text.StyledEditorKit.BoldAction;

class gu22 extends JFrame {
	gu22() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("연습");

		setLayout(new FlowLayout());

		JMenuBar bar11 = new JMenuBar();
		JMenu me = new JMenu("메1");
		JMenuItem it = new JMenuItem("하위");
		setJMenuBar(bar11);
		bar11.add(me);
		me.add(it);
		

		JButton bt4 = new JButton("버튼44");
		bt4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				bt4.setBackground(Color.BLACK);

			}
		});
		add(bt4);

		JTextField tx1 = new JTextField(20);
		JTextField tx2 = new JTextField(20);
		add(tx1);
		add(tx2);
		this.addMouseListener(new MouseListener() {

			@Override
			public void mouseReleased(MouseEvent e) {
			}

			@Override
			public void mousePressed(MouseEvent e) {
				// TODO Auto-generated method stub

			}

			@Override
			public void mouseExited(MouseEvent e) {
				// TODO Auto-generated method stub

			}

			@Override
			public void mouseEntered(MouseEvent e) {
				// TODO Auto-generated method stub

			}

			@Override
			public void mouseClicked(MouseEvent e) {
				tx1.setText(Integer.toString(e.getX()));
				tx2.setText(Integer.toString(e.getY()));

			}
		});
		JTextField fi1 = new JTextField(20);

		add(fi1);
		JTextField tx3 = new JTextField(10);
		add(tx3);
		tx3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("ㅇㅅㅁ");
			}
		});

		JTextArea fi2 = new JTextArea(5, 10);
		add(fi2);

		ImageIcon ima1 = new ImageIcon("image/java1.png");
		JButton bt1 = new JButton("버튼", ima1);
		add(bt1);
		JButton bt6 = new JButton("버튼", ima1);
		bt6.add(bt1);
		add(bt6);

		JCheckBox bt2 = new JCheckBox("체크박스", true);
		bt2.setToolTipText("아아");
		add(bt2);

		JToggleButton bt3 = new JToggleButton("토글버튼");
		add(bt3);

		JLabel la1 = new JLabel("라벨");
		add(la1);

		JScrollPane sc = new JScrollPane(fi2);
		add(sc);
		setBackground(Color.black);
		setSize(512, 512);
		setVisible(true);

	}

}

public class Day8_1 {
	public static void main(String[] args) {

		new gu22();
	}
}
