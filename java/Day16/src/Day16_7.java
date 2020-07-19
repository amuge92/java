import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;
import javax.swing.JFrame;

class ha extends JFrame {

	ha() {
		Container c = getContentPane();

		setLayout(new FlowLayout());
		JButton bt1 = new JButton("¿ø");
		JButton bt2 = new JButton("Åõ");
		bt1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				c.setBackground(Color.green);

			}
		});
		bt2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				bt1.setEnabled(false);
			}
		});
		add(bt1);
		add(bt2);

		setVisible(true);
		setSize(500, 500);

	}

}

public class Day16_7 {
	public static void main(String[] args) {

		new ha();

	}
}
