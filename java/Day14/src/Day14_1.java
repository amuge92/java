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
		// ��ü�迭[2]�����ؼ� ���� �Է����� ���

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
