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
//		1. 입력받은 텍스트를 java.txt파일에 저장하는 프로그램을 작성해라. (InputStreamReader, FileWriter 사용)
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
////		2.main()를 보고 클래스를 작성해라.
//		Student s1 = new Student("김길동", "kim");
//		Student s2 = new Student("이길동", "lee");
//		s1.pr();
//		s2.pr(); // 모든 데이터 출력
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
