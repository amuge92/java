import java.awt.GridLayout;
import java.awt.ItemSelectable;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.ButtonGroup;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JRadioButton;

class Check implements ItemListener {
	JRadioButton j1;
	JRadioButton j2;
	JRadioButton j3;

	Check(JRadioButton j1, JRadioButton j2, JRadioButton j3) {
		this.j1 = j1;
		this.j2 = j2;
		this.j3 = j3;
	}

	public void itemStateChanged(ItemEvent e) {
		if (e.getStateChange() == ItemEvent.SELECTED) {
			j1.setEnabled(true);
			j2.setEnabled(true);
			j3.setEnabled(true);
		} else {
			j1.setEnabled(false);
			j2.setEnabled(false);
			j3.setEnabled(false);
		}
	}

}

class gg extends JFrame {
	gg() {
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLayout(new GridLayout());

		JCheckBox jc = new JCheckBox("°øºÎ ¼±ÅÃ");

		JRadioButton jb1 = new JRadioButton("Java");
		JRadioButton jb2 = new JRadioButton("Python");
		JRadioButton jb3 = new JRadioButton("C#");

		ButtonGroup bg = new ButtonGroup();
		bg.add(jb1);
		bg.add(jb2);
		bg.add(jb3);

		jc.addItemListener(new Check(jb1, jb2, jb3));

		add(jc);
		add(jb1);
		add(jb2);
		add(jb3);
		jb1.setEnabled(false);
		jb2.setEnabled(false);
		jb3.setEnabled(false);

		jb1.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				if (e.getStateChange() == ItemEvent.SELECTED) {
					System.out.println("ÀÚ¹Ù!!");
				}
			}
		});
		jb2.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				if (e.getStateChange() == ItemEvent.SELECTED) {
					System.out.println("ÆÄÀÌ½ã!!");
				}
			}
		});
		jb3.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				if (e.getStateChange() == ItemEvent.SELECTED) {
					System.out.println("¾¾¼¥!!");
				}
			}
		});

		setVisible(true);
		setSize(512, 512);

	}

}

public class Day17_3 {
	public static void main(String[] args) {

		new gg();

	}
}
