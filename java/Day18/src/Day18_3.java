import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/*�˾� ���̾�α�
1) �Է� ���̾�α�   JOptionPane.showInputDialog()       ..String
ok��ư�� ���� ���� �Է��� ���� ���� �ȴ�.ĵ�� ��ư�� null��

2)Ȯ�� ���̾�α�
JOptionPane.showConfirmDialog()    ..int

3)�޼��� ���̾�α�
JOptionPane.showMessageDialog()      ...String
*/
public class Day18_3 extends JFrame {

	JLabel j = new JLabel("���ڿ�");

	public Day18_3() {
		Container c = getContentPane();

		JTextField jf = new JTextField();
//		String name =JOptionPane.showInputDialog("�̸���");
//		jf.setText(name);

//		String name2 = JOptionPane.showMessageDialog(   ,   );
//		jf.setText(name2);
//		int name1 = JOptionPane.showConfirmDialog(null, "���?", "Ȯ��", JOptionPane.YES_NO_OPTION);
//		jf.setText(name1);
		c.setLayout(new FlowLayout());
		c.add(j);

		setSize(512, 512);
		setVisible(true);
		c.addKeyListener(new Key());
		c.requestFocus();// ����Ʈ�ҿ� ��Ŀ�� ����. Ű �Է� �����ϵ���

	}

	class Key extends KeyAdapter {
		public void keyPressed(KeyEvent e) {
			int a = (int) (Math.random() * 256);
			int b = (int) (Math.random() * 256);
			int c = (int) (Math.random() * 256);
			switch (e.getKeyChar()) {
			case '\n':
				j.setText(a + " " + b + " " + c);
				getContentPane().setBackground(new Color(a, b, c));
				break;
			case 'p':
				System.exit(0);
			}
		}
	}

	public static void main(String[] args) {
		new Day18_3();
	}
}
