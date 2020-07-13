import java.util.Scanner;

class profile {
	String name;
	String a;

	profile(String n, String id) {
		name = n;
		this.a = id;
	}

}

public class Day14_1 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		profile p[] = new profile[2];
		// 객체배열[2]생성해서 값을 입력한후 출력

		for (int i = 0; i < 2; i++) {
			String n = s.next();
			String id = s.next();
			p[i] = new profile(n, id);
		}
		for (int i = 0; i < 2; i++) {
			System.out.println(p[i].name + " " + p[i].a);
		}

	}
}
