

//���̾�α� 


import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class Day18_4 extends JFrame {
	Day18_4() {

		setTitle("���̾�α�");
		setLayout(new FlowLayout());
		Container c = getContentPane();
		c.add(new Dia(), BorderLayout.CENTER);
//		c.add(new Dia());
		setVisible(true);

	}

	class Dia extends Panel {
		JButton bt1 = new JButton("name");
		JTextField j = new JTextField(10);
		JButton bt2 = new JButton("Ȯ��");
		JButton bt3 = new JButton("�޻���");

		Dia() {
			setBackground(Color.BLACK);
			add(j);
			add(bt1);
			add(bt2);
			add(bt3);

			bt1.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					String name = JOptionPane.showInputDialog("�̸� �Է�");
					if (name != null) {
						j.setText(name);
					}

				}
			});

			bt2.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					int r = JOptionPane.showConfirmDialog(null, "��� ����?", "Ȯ��", JOptionPane.YES_NO_CANCEL_OPTION);
					if (r == JOptionPane.CLOSED_OPTION) {
						j.setText("���� ����");
					} else if (r == JOptionPane.YES_OPTION) {
						j.setText("��");
					}
				}
			});
			bt3.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					JOptionPane.showMessageDialog(null, "���111", "�޽���", JOptionPane.ERROR_MESSAGE);
				}
			});
		}
	}

	public static void main(String[] args) {
		new Day18_4();
	}
}
