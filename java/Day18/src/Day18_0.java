//�޺� �ڽ�~!~!~~~~~~~~~~~~@#$
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ComboBoxEditor;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;

class Text implements ActionListener {
	JTextArea jt;

	Text(JTextArea jt) {
		this.jt = jt;
	}

	public void actionPerformed(ActionEvent e) {
		jt.setText("");
		jt.append("���� �Է� : ");
	}

}

public class Day18_0 {
	static String[] s = { "ġŲ", "���" };
	static ImageIcon[] im = { new ImageIcon("C:\\Users\\Administrator\\Desktop\\i2.jpg"),
			new ImageIcon("C:\\Users\\Administrator\\Desktop\\i1.jpg") };
	static JLabel j1 = new JLabel(im[0]);

	public static void main(String[] args) {

		JFrame j = new JFrame();
		Container c = j.getContentPane();
		
		c.setLayout(new FlowLayout());
		j.setSize(512, 512);
		
		JComboBox com =  new JComboBox(s);
		com.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JComboBox c = (JComboBox) e.getSource();
				int i = c.getSelectedIndex();
				//�޺��ڽ��� ���õ� ������ �ε��� �˾Ƴ���
				j1.setIcon(im[i]);
			}
		});
		
		
		c.add(com);
		
		
		c.add(j1);
		
		
		JTextArea jt = new JTextArea(10, 20);
		jt.append("���� �Է� : ");

		JButton bt1 = new JButton("���� ��ư");
		bt1.addActionListener(new Text(jt));

		j.add(bt1);
		j.add(jt);
		jt.setLineWrap(true);// �ڵ� �� �ٲ� ���� ����

		j.setVisible(true);
	}
}
