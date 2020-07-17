import java.awt.FlowLayout;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Day19_4 {
	public static void main(String[] args) throws IOException {
		new Jf();
		byte by[] = { 1, 2, 3, 4, 5 };
		BufferedOutputStream bf = new BufferedOutputStream(new FileOutputStream("fi.txt"));
		for (int i = 0; i < 5; i++) {
			bf.write(by[i]);
		}
		bf.close();

		BufferedInputStream bi = new BufferedInputStream(new FileInputStream("fi.txt"));
		int bd, i = 0;
		byte bbd[] = new byte[5];
		while ((bd = bi.read()) != -1) {
			bbd[i] = (byte) bd;
			System.out.println(bbd[i]);
			i++;
		}
		bi.close();

		int[] arr = { 1, 2, 3, 4, 5 };
		int r;
		r =add(arr, 5);
	}

	static int add(int[] arr, int a) {
		int d = 0;
		for (int i = 0; i < a; i++) {
			d += arr[i];
		}
		return d;
	}
}

class Jf extends JFrame {
	String[] ii = { "C:\\ima\\1.jpg", "C:\\ima\\2.jpg", "C:\\ima\\3.jpg" };

	Jf() {
		setLayout(new FlowLayout());
		ImageIcon[] ima = new ImageIcon[3];
		JLabel j[] = new JLabel[3];
		for (int i = 0; i < 3; i++) {
			ima[i] = new ImageIcon(ii[i]);
			j[i] = new JLabel(ima[i]);
			add(j[i]);
			setVisible(true);
		}
	}
}
