import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

class Aa implements ActionListener {
	public void actionPerformed(ActionEvent e) {
		JButton b = (JButton) e.getSource();//��ư b�� getSource�� ����.
		// �̺�Ʈ�� ��� �߻��ߴ��� �˾Ƴ���.
        //getSource �޼ҵ�� ObjectŬ���� ��ü�̹Ƿ� �ٿ�ĳ���� �ؼ� �˾Ƴ���.
		
		if(b.getText().equals("java")) {
			b.setText("�ڹ�");
		}
	} 
}

class Gu extends JFrame {

	Gu() {
		
		Container c = getContentPane();

		c.setLayout(new FlowLayout());
		JButton bt1 = new JButton("java");
		bt1.addActionListener(new Aa());
		c.add(bt1);
		setVisible(true);
		setSize(400, 400);
		c.setSize(200, 200);
	}
}

public class Day16_2 {
	public static void main(String[] args) {

		new Gu();
	}
}