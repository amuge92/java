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
	pro1() {

		setLayout(new GridLayout(5, 2));
		JLabel jl[] = new JLabel[6];
		JTextField jt[] = new JTextField[5];
		jl[0]=new JLabel("사번 : ");
		jl[1]=new JLabel("이름 : ");
		jl[2]=new JLabel("부서 : ");
		jl[3]=new JLabel("주소 : ");
		jl[4]=new JLabel("특이사항");
		for (int i = 0; i < 5; i++) {
			add(jl[i]);
            jt[i]=new JTextField(10);			
			add(jt[i]);
		}
		

		setVisible(true);
		setSize(150, 150);
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
		proima.setBounds(270, 15, 70, 100);
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