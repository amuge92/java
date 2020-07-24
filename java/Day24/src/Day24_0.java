import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Vector;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

class sap {
	Scanner s = new Scanner(System.in);
	String a, b;
	HashMap<String, String> h = new HashMap<String, String>();

	void add(String a, String b) {
		this.a = a;
		this.b = b;
		h.put(a, b);
	}
}

class te extends JFrame {
	Scanner s = new Scanner(System.in);
	sap sap = new sap();

	te() {
		setLayout(new FlowLayout());
		Container c = getContentPane();
		JLabel jl1 = new JLabel("영어");
		JTextField j1 = new JTextField(10);
		JLabel jl2 = new JLabel("한글");
		JTextField j2 = new JTextField(10);
		JTextArea ja = new JTextArea(20, 20);

		JButton bt1 = new JButton("삽입");
		JButton bt2 = new JButton("찾기");
		bt1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(sap.h.containsKey(j1.getText())){
					ja.setText(ja.getText() + "\n" +"이미 존재함");
				}else {
				sap.add(j1.getText(), j2.getText());
				ja.setText(ja.getText() + "\n" + "삽입" + "("+sap.a + "," + sap.b+")");
			}}
		});
		bt2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String str = j1.getText();
				String str1 = sap.h.get(str);
				if (!sap.h.containsKey(str))
					str1 = "존재하지 않음";
				ja.setText(ja.getText() + "\n" + str1);
			}
		});

		c.add(jl1);
		c.add(j1);
		c.add(jl2);
		c.add(j2);
		c.add(bt1);
		c.add(bt2);
		c.add(ja);
		setVisible(true);

	}

}

public class Day24_0 {
	public static void main(String[] args) {
		new te();

	}
}
