import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JRadioButton;

class gui extends JFrame {
	gui() {
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLayout(new FlowLayout());
		Container c = getContentPane();
		JRadioButton j1 = new JRadioButton("Â«Â¥¸é");
		JRadioButton j2 = new JRadioButton("ººÂ«¸é");

		ItemListener a = new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				if (e.getItem() == j1) {
					System.out.println("Â¥Àå");
				}
				if (e.getItem() == j2) {
					c.setBackground(Color.black);
				}
			}
		};

		j1.addItemListener(a);
		j2.addItemListener(a);

//		j1.addItemListener(new ItemListener() {
//			public void itemStateChanged(ItemEvent e) {
//              System.out.println("Â«Â¥¸é");
//			}
//		});
//		j2.addItemListener(new ItemListener() {
//			public void itemStateChanged(ItemEvent e) {
//						c.setBackground(Color.GREEN);}
//		});

		add(j1);
		add(j2);

		ButtonGroup bg = new ButtonGroup();

		bg.add(j1);
		bg.add(j2);

		setVisible(true);
		setSize(512, 512);

	}

}

public class Day17_2 {
	public static void main(String[] args) {
		new gui();
	}
}
