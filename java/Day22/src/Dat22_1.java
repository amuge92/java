import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JTextArea;

class Number {
	int a;

	static int pr(int a) {
		return a;
	}

	void show(double a) {
		System.out.println(a);
	}
}

public class Dat22_1 {
	public static void main(String[] args) {

		Number.pr(100);
		Number n = new Number();
		n.show(3.14);
		gu2 d = new gu2();
//	�����ӿ� ������
//	����(1~50)�������� �� �ϳ��� ����, 
//		 ��ư ��+5��, ��-5��, ��/5����ư�� ����� +5�� ������ ������ ������ +5�Ѱ��� ����,
//		 ������ ��ư�� �˸��� ������ �ϵ��� �����ض�. ��ư�� �� �ѹ��ۿ� ��������.

	}
}

class gu2 extends JFrame {
	int a = (int) (Math.random() * 50) + 1;
static int b= (int) (Math.random() * 50) + 1;
	gu2() {
		JTextArea ja = new JTextArea(10, 10);
		add(ja);
		ja.setText(String.valueOf(a));

		setLayout(new FlowLayout());
		JButton bt1 = new JButton("+5");
		bt1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String str = a + 5 + "";
				a=a+5;
				ja.setText(str);
				bt1.setEnabled(false);
			}
		});
		JButton bt2 = new JButton("-5");
		bt2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String str = a - 5 + "";
				a=a-5;
				ja.setText(str);
				bt2.setEnabled(false);
			}
		});
		JButton bt3 = new JButton("/5");
		bt3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String str = a / 5 + "";
				a=a/5;
				ja.setText(str);
				bt3.setEnabled(false);
			}
		});
		add(bt1);
		add(bt2);
		add(bt3);
		setVisible(true);
	}
}