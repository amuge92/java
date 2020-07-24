import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.ButtonGroup;
import javax.swing.JCheckBox;
import javax.swing.JFrame;

class gu extends JFrame {
	gu() {

		setLayout(new FlowLayout());
		Container c = getContentPane();

		JCheckBox jc1 = new JCheckBox("ÃÊ·Ï");
		JCheckBox jc2 = new JCheckBox("ÆÄ¶û");
		ButtonGroup bt = new ButtonGroup();
		jc1.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				c.setBackground(Color.GREEN);
			}
		});
		jc2.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				c.setBackground(Color.blue);
			}
		});

		bt.add(jc1);
		bt.add(jc2);

		c.add(jc1);
		c.add(jc2);

		setVisible(true);

	}
}

public class Day24_4 {
	static int max = 0;

	static int get(int[][] a) {
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				if (max < a[i][j])
					max = a[i][j];
			}
		}
		return max;
	}

	public static void main(String[] args) {
//		new gu();
		int[][] score = { { 40, 78, 94 }, { 26, 79, 74 } };
		int high = get(score);
		System.out.println(high);
		
		System.out.println(0%5);
		
		
	}
}
