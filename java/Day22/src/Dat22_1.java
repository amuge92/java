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
//	프레임에 임의의
//	정수(1~50)범위에서 수 하나를 띄우고, 
//		 버튼 “+5”, “-5”, “/5”버튼을 만들어 +5를 누르면 임의의 수에서 +5한값을 띄우고,
//		 나머지 버튼도 알맞은 연산을 하도록 구현해라. 버튼은 단 한번밖에 못누른다.

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