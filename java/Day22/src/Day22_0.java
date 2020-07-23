import java.awt.Dialog;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class Day22_0 {
	static Gu g ;
	public static void main(String[] args) throws IOException {
	
		g = new Gu();
	}
}
class Aa extends JDialog {
Day22_0 d = new Day22_0();
	JLabel jl= new JLabel("두 수를 더합니다");
	JTextField jf1 = new JTextField(10);
	JTextField jf2 = new JTextField(10);
	JButton bt = new JButton("ADD");
	Aa() {
		setLayout(new FlowLayout());
		bt.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				int a = Integer.parseInt(jf1.getText());
				int b = Integer.parseInt(jf2.getText());
				String str = (a + b) + "";
				d.g.jl1.setText(str);	
			}
		});
		add(jl);
		add(jf1);
		add(jf2);
		add(bt);

		setSize(512, 512);
		setVisible(true);
	}
}

class Gu extends JFrame {
	JLabel jl1 = new JLabel("계산 출력");
	Gu() {

		JButton bt1 = new JButton("Cal");
		bt1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Aa a = new Aa();
			}
		});
		setLayout(new FlowLayout());
		add(bt1);
		add(jl1);
		setVisible(true);
	}
}