import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/*팝업 다이얼로그
1) 입력 다이얼로그   JOptionPane.showInputDialog()       ..String
ok버튼을 누면 내가 입력한 값이 리턴 된다.캔슬 버튼은 null값

2)확인 다이얼로그
JOptionPane.showConfirmDialog()    ..int

3)메세지 다이얼로그
JOptionPane.showMessageDialog()      ...String
*/
public class Day18_3 extends JFrame {

	JLabel j = new JLabel("문자열");

	public Day18_3() {
		Container c = getContentPane();

		JTextField jf = new JTextField();
//		String name =JOptionPane.showInputDialog("이름은");
//		jf.setText(name);

//		String name2 = JOptionPane.showMessageDialog(   ,   );
//		jf.setText(name2);
//		int name1 = JOptionPane.showConfirmDialog(null, "계속?", "확인", JOptionPane.YES_NO_OPTION);
//		jf.setText(name1);
		c.setLayout(new FlowLayout());
		c.add(j);

		setSize(512, 512);
		setVisible(true);
		c.addKeyListener(new Key());
		c.requestFocus();// 컨팬트팬에 포커스 설정. 키 입력 가능하도록

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
