import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Label;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

import javax.print.attribute.standard.MediaSize.NA;
import javax.swing.JFrame;
import javax.swing.JLabel;

class Th extends Thread {
	JLabel j;

	Th(JLabel j) {
		this.j = j;
	}

	public void run() {
		for (int i = 0; i < 10; i++) {
			try {
				String str = String.valueOf(i);
				j.setText(str);
				sleep(1000);

			} catch (Exception e) {
				return;
			}

		}
	}

}

class gu9 extends JFrame {
	gu9() {
		setVisible(true);
//		setLayout(new GridLayout(1, 5));
		setLayout(new FlowLayout());
		Container c1 = getContentPane();
		JLabel j = new JLabel();
		c1.add(j);

//		Color c[] = { Color.RED, Color.ORANGE, Color.YELLOW, Color.GREEN, Color.BLUE };
//		JButton bt[] = new JButton[5];
//		for (int i = 0; i < 5; i++) {
//			bt[i] = new JButton();
//			bt[i].setBackground(c[i]);
//			c1.add(bt[i]);
//		}
		Th t = new Th(j); // 쓰레드 객체 생성
		setVisible(true);
		t.start(); // 쓰레드 실행

		setSize(512, 512);
	}

}
class Na{
	int n;
	Na(Integer n){
		this.n=n;
	}
	public String toString(){
		return n+"";
	}
}
public class Day20_2 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		HashSet<Integer> hi = new HashSet<>();
		hi.add(3);
		hi.add(5);
		hi.add(7);
		hi.add(10);
		hi.add(26);
		hi.add(33);

		HashSet<Na> hs = new HashSet<>();
		hs.add(new Na(30));
		hs.add(new Na(40));
		hs.add(new Na(60));
		Iterator<Na> ihs = hs.iterator();
		while(ihs.hasNext()) {
		System.out.println(ihs.next());
		}
		System.out.println(hi.hashCode());

		HashMap<String, Integer> hn = new HashMap<String, Integer>();

		hn.put("홍길", 30);
		hn.put("황길", 40);
		hn.put("청길", 50);
		hn.put("녹길", 60);
//		System.out.println(hn.get("홍길"));

//		new gu9();
//		ArrayList<Integer> ai = new ArrayList<Integer>();
//		for (int i = 0; i < 100; i++) {
//			ai.add((int) (Math.random() * 100));
//		}
//		Iterator<Integer> ii = ai.iterator();
//		while (ii.hasNext()){
//			System.out.println(ii.next());
//		}
	}
}
