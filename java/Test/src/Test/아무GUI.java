package Test;

import java.awt.Color;
import java.awt.Container;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.HashMap;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JPanel;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

class Profile {
	int sabun;
	String name, buseo, juso, ex;

	Profile() {
	}
}

class pro1 extends JFrame {
	ImageIcon ima;

	pro1() {
		setTitle("정보 입력");
		JLabel jli = new JLabel("이미지 주소 : ");
		JTextField jti = new JTextField(20);
		setLayout(new GridLayout(9, 2));
		JLabel jl[] = new JLabel[8];
		JTextField jt[] = new JTextField[5];
		jl[0] = new JLabel("사번 : ");
		jl[1] = new JLabel("이름 : ");
		jl[2] = new JLabel("부서 : ");
		jl[3] = new JLabel("주소 : ");
		jl[4] = new JLabel("특이사항");
		jl[5] = new JLabel();
		add(jli);
		add(jti);

		for (int i = 0; i < 4; i++) {
			add(jl[i]);
			jt[i] = new JTextField(10);
			add(jt[i]);
		}
		add(jl[4]);
		add(jl[5]);
		jt[4] = new JTextField(20);
		add(jt[4]);

		setVisible(true);
		setSize(250, 200);
	}
}

class GU extends JFrame {
	clcl a = new clcl();

	HashMap<Integer, Profile> hm = new HashMap<Integer, Profile>();

	GU() {
		addMouseListener(a);
		JButton bt = new JButton("추가");
		add(bt);
		bt.setBounds(20, 20, 50, 50);
		bt.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				pro1 P1 = new pro1();
			}
		});

		setTitle("프로필");
		Container c = getContentPane();
		c.setLayout(null);
		JPanel jp1 = new JPanel();
		jp1.setBounds(20, 445, 352, 80);
		jp1.setBackground(new Color(200, 200, 200));
		add(jp1);

		JLabel label = new JLabel();
		JLabel proima = new JLabel();
		label.add(proima);
		proima.setBackground(Color.BLACK);
		proima.setOpaque(true);
		proima.setBounds(250, 15, 90, 120);
		label.setBackground(new Color(200, 200, 200));
		label.setOpaque(true);
		label.setBounds(20, 85, 352, 350);
		c.add(label);
		JMenuBar jm = new JMenuBar();
		JMenu jm1 = new JMenu("저장");
		JMenu jm2 = new JMenu("불러오기");
		JMenu jm3 = new JMenu("종료");
		jm3.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				System.exit(0);
			}
		});

		jm.add(jm1);
		jm.add(jm2);
		jm.add(jm3);
		setJMenuBar(jm);
		setResizable(false);
		setSize(412, 612);
		setVisible(true);
	}
}

public class 아무GUI {
	public static void main(String[] args) {

		new GU();
	}
}

class clcl extends MouseAdapter {
	public void mouseClicked(MouseEvent e) {
		System.out.println(e.getX() + "  " + e.getY());
	}

	clcl() {
	}

}