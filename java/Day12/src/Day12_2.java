import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

class Cal22 {
	static int add(int a, int b) {
		return a + b;
	}

	static int div(int a, int b) {
		return a / b;
	}
}

public class Day12_2 {
	public static void main(String[] args) throws IOException {
//		1. �Է¹��� �ؽ�Ʈ�� java.txt���Ͽ� �����ϴ� ���α׷��� �ۼ��ض�. (InputStreamReader, FileWriter ���)
//		BufferedWriter bw = new BufferedWriter(new FileWriter("java.txt"));
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//
//		bw.write(br.readLine());
//
//		bw.close();
//		br.close();
//
//		class Student {
//			String name;
//			String fam;
//
//			Student(String name, String fam) {
//				this.name = name;
//				this.fam = fam;
//			}
//
//			void pr() {
//				System.out.println(name + " " + fam);
//			}
//		}
////		2.main()�� ���� Ŭ������ �ۼ��ض�.
//		Student s1 = new Student("��浿", "kim");
//		Student s2 = new Student("�̱浿", "lee");
//		s1.pr();
//		s2.pr(); // ��� ������ ���
//
//		class Music {
//			String title;
//			String singer;
//
//			Music(String title, String singer) {
//				this.title = title;
//				this.singer = singer;
//			}
//
//			Music(String title) {
//				this.title = title;
//
//			}
//		}
//		Music m = new Music("On", "Bts");
//		System.out.println(m.title + "" + m.singer);
//		Music m1 = new Music("00:00");
//		System.out.println(m1.title + "" + m1.singer);
//
//		int a = Cal.add(10, 5);
//		int b = Cal.div(10, 5);
//		System.out.println(a + " " + b);
		for (int i = 0; i < 4; i++) {
			int n = 0;
			for (int j = 0; j < 3 - i; j++) {
				System.out.print(" ");
			}
			for (int j = 0; j < 2*i+1; j++) {
				System.out.print(n);
			n++;}
		System.out.println();
		}
	}
}
