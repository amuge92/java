import java.awt.Button;
import java.awt.GridLayout;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.JTextField;

class Ex2 extends JFrame {

	Ex2() {

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("연습2");

		setLayout(new GridLayout(10, 10));
		JButton bt1 = new JButton("버튼 1번");
		JTextArea ar1 = new JTextArea(10, 10);
		JTextField fi1 = new JTextField(10);

		add(fi1);
		add(ar1);

		fi1.addKeyListener(new KeyAdapter() {
			public void keyRelased(KeyEvent e) {
				int key = e.getKeyCode();

				if (key == KeyEvent.VK_SPACE) {
					String str = fi1.getText();
					ar1.setText(ar1.getText() + str + '\n');
				}
				
				
				
				
			}
		});

		setSize(500, 500);
		setVisible(true);
	}

}

public class Day8_3 {
	public static void main(String[] args) {

		new Ex2();
	}
}
