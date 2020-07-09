import java.awt.GridLayout;
import java.awt.Image;
import java.awt.Robot;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

class Ex extends JFrame {
	Ex() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("예제1");

		JMenuBar ba = new JMenuBar();
		JMenu me = new JMenu("메뉴");
		JMenuItem it = new JMenuItem("이미지섞");
		setJMenuBar(ba);
		ba.add(me);
		me.add(it);

		setLayout(new GridLayout(3, 3));
		JButton[] bt = new JButton[9];
		ImageIcon[] im = new ImageIcon[9];
		String Imagename[] = { "1.PNG", "2.PNG", "3.PNG", "4.PNG", "5.PNG", "6.PNG", "7.PNG", "8.PNG", "9.PNG" };
//		for (int i = 0; i < 9; i++) {
//			im[i] = new ImageIcon("C:/Users/Public/Downloads/" + Imagename[i]);
//			bt[i] = new JButton(im[i]);
//			add(bt[i]);
//		}
		this.addKeyListener(new KeyAdapter() {
			public void keyReleased(KeyEvent e) {
				getContentPane().removeAll();
				for (int i = 0; i < 9; i++) {
					im[i] = new ImageIcon("C:/Users/Public/Downloads/" + Imagename[(int) (Math.random() * 8 + 1)]);
					bt[i] = new JButton(im[i]);
					add(bt[i]);
				}
				validate();

			}
		});
		it.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent arg0) {
				try {
					Robot robot = new Robot();
					robot.keyPress(KeyEvent.VK_SPACE);

				} catch (Exception e) {
				}
			}
		});

		setSize(512, 512);
		setVisible(true);

	}

}

public class Day8_2 {
	public static void main(String[] args) {
		new Ex();
	}
}
