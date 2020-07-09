import java.awt.*;

import javax.swing.JButton;
import javax.swing.JFrame;
import java.util.Scanner;

public class Day6_3 {
	static class GUI extends JFrame {
		GUI() {
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

			setTitle("연습");
//내용
			this.setLayout(new FlowLayout(FlowLayout.CENTER,500,500));
			JButton bt1 = new JButton("이거");
					this.add(bt1);
			setSize(1024, 720);
			setVisible(true);
		}

	}

	public static void main(String[] args) {
		new GUI();
	}
}