import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

import java.io.InputStreamReader;

class Rectangle {
	int width;
	int height;

	int area() {
		int a = width * height;
		return a;
	}

}

class Song {
	private String song = "";

	Song(String song) {
		this.song = song;
	}

	String getsong() {
		return this.song;
	}

}

public class Day11_ex {
	public static void main(String[] args) throws IOException {
		Scanner s = new Scanner(System.in);
		int a = 0;
		int aa = 0;
		int aaa = 1;
		while (true) {
			a = s.nextInt();
			if (a == -1) {
				System.out.println(aa / aaa);
				break;
			}
			aa = aa + a;
			aaa++;
		}

		BufferedWriter bw = new BufferedWriter(new FileWriter("test01.txt"));
		bw.write("Hi");
		bw.newLine();
		bw.write("저는 자바를 좋아하고 잘합니다.");
		bw.newLine();
		bw.write("앞으로 더 열심히 공부할 것입니다.");
		bw.close();

		BufferedWriter bw1 = new BufferedWriter(new FileWriter("test02.txt"));
		String brr = "";
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		for (;;) {
			String d = br.readLine();
			bw1.write(d);
			bw1.newLine();
			if (d.contains("그만")) {
				break;
			}
			System.out.println(d);
		}
		br.close();
		bw1.close();

		BufferedReader br1 = new BufferedReader(new FileReader("test02.txt"));
		int r = br.read();
		for (;;) {
			if (r != -1)
				System.out.println((char) r);
			else
				break;

		}

		Rectangle rec = new Rectangle();
		rec.width = 5;
		rec.height = 6;
		System.out.println("사각형 면적 = " + rec.area());

		Song s1 = new Song("On");
		Song s2 = new Song("00:00");
		System.out.println("좋아하는 노래 " + s1.getsong());
		System.out.println("내 노래 " + s2.getsong());

	}
}
