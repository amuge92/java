import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

class gugu extends JFrame {

	gugu() {
		setVisible(true);
		Container c = getContentPane();
		JPanel jp1 = new JPanel();
		JPanel jp2 = new JPanel();
		JPanel jp3 = new JPanel();
		jp1.setBackground(Color.gray);
		jp2.setLayout(new GridLayout(4, 4));
		jp3.setBackground(Color.red);

		c.add(jp1, BorderLayout.NORTH);
		c.add(jp2);
		c.add(jp3, BorderLayout.SOUTH);
		JLabel j1 = new JLabel("입력");
		JTextField j2 = new JTextField(10);
		jp1.add(j1);
		jp1.add(j2);
		JLabel j3 = new JLabel("계산 결과");
		JTextField j4 = new JTextField(10);
		jp3.add(j3);
		jp3.add(j4);

		for (int i = 0; i < 16; i++) {
			JButton bt = new JButton();
			String[] s = { "+", "-", "*", "/", "계산", "취소" };
			jp2.add(bt);
			if (i < 10) {
				bt.setText(String.valueOf(i));
				bt.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						j2.setText(j2.getText() + bt.getText());
					}
				});
			} else {
				bt.setText(s[i - 10]);
			}
		}

		setSize(512, 512);

	}
}

public class Day20_7 {
	public static void main(String[] args) {

		new gugu();

	}
}
