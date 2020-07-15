import java.awt.Container;
import java.awt.Desktop.Action;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;

import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

class Text implements ActionListener {
	JTextField id;
	JPasswordField password;

	Text(JTextField id, JPasswordField password) {
		this.id = id;
		this.password = password;
	};

	public void actionPerformed(ActionEvent e) {
		System.out.println("아이디 : " + id.getText() + "\n비밀번호 : " + new String(password.getPassword()));
	}

}

public class Day17_4 {
	public static void main(String[] args) {
		JFrame j = new JFrame();
		j.setLayout(new FlowLayout());
		j.setVisible(true);
//		JLabel j1 = new JLabel("ID", SwingConstants.LEFT);
//		JTextField id = new JTextField(10);

		JTextField jt1 = new JTextField(20);
		JTextArea ja1 = new JTextArea(10, 20);
		JLabel j1 = new JLabel("엔터키 입ㄺ");
		j.add(j1);
		j.add(jt1);
		j.add(new JScrollPane(ja1));

		jt1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JTextField jt = (JTextField) e.getSource();
				ja1.append(jt.getText());
				
				jt.setText("");
			}
		});

//		JLabel j2 = new JLabel("PW", SwingConstants.LEFT);
//		JPasswordField password = new JPasswordField(10);
//		password.setEchoChar('1');
//		Text t = new Text(id, password);

//		JCheckBox[] a = new JCheckBox[15];
//		for (int i = 0; i < 15; i++) {
//			a[i] = new JCheckBox("체크박스" + (i+1));
//			j.add(a[i]);
//		}

//		password.addActionListener(t);
//		j.add(j1);
//		j.add(id);
//		j.add(j2);
//		j.add(password);
	}
}
