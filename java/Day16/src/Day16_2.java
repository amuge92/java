import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

class Aa implements ActionListener {
	public void actionPerformed(ActionEvent e) {
		JButton b = (JButton) e.getSource();//버튼 b와 getSource와 같다.
		// 이벤트가 어디서 발생했는지 알아낸다.
        //getSource 메소드는 Object클래스 객체이므로 다운캐스팅 해서 알아낸다.
		
		if(b.getText().equals("java")) {
			b.setText("자바");
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