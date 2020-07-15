import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;

import com.sun.jdi.event.Event;

public class Day17_5 extends JFrame {

	public Day17_5() {

		setLayout(new FlowLayout());

		JCheckBox jc1 = new JCheckBox("��Ȱ��ȭ");
		JCheckBox jc2 = new JCheckBox("���߱�");
		JButton bt1 = new JButton("��ư");
		jc2.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				if (e.getStateChange() == ItemEvent.SELECTED)
					bt1.setVisible(false);
				else
					bt1.setVisible(true);
			}
		});
		jc1.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				if (e.getStateChange() == ItemEvent.SELECTED)
					bt1.setEnabled(false);
				else
					bt1.setEnabled(true);
			}
		});

		add(bt1);
		add(jc1);
		add(jc2);

		setSize(512, 512);
		setVisible(true);

	}

	public static void main(String[] args) {
		new Day17_5();
	}
}
