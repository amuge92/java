import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

class Hu extends JFrame {

	Hu() {
		setTitle("������");
		JLabel j = new JLabel("�ڹٴ�");

		j.setSize(50, 50);
		j.setFont(new Font("���", Font.ITALIC, 50));
		j.addMouseListener(new MouseAdapter() {
			public void mouseEntered(MouseEvent e) {
             j.setText("��վ�");
			}
			public void mouseExited(MouseEvent e) {
	             j.setText("�ڹٴ�");
				}
		});
		
		Container c = getContentPane();
		c.add(j);
		
		
		c.setLayout(new FlowLayout());
		JButton bt1 = new JButton("������");
		bt1.addMouseListener(new MouseAdapter() {
		public void mouseClicked(MouseEvent e){
		System.out.println("OK");}});
		JButton bt2 = new JButton("ĵ��");
	    bt2.addMouseListener(new MouseAdapter() {
		public void mouseClicked(MouseEvent e){
		bt2.setEnabled(false);}});
		c.add(bt1);
		c.add(bt2);
		setVisible(true);
		c.setSize(300,300);
		setSize(512, 512);
	}}

public class Day16_5 {
	public static void main(String[] args) {
		new Hu();
	}
}
