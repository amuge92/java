import java.util.Scanner;

class Num extends Exception {
	Num() {
		super("�߸��� ��!!");

	}

}

public class Day12_8 {
	static int in() throws Num {
		Scanner s = new Scanner(System.in);
		int in = s.nextInt();
		if (in < 0) {
			Num nn = new Num();
			throw nn;
		}
		return in;
	}

	public static void main(String[] args) {

		System.out.println("����� �Է��ض�");
		try {
			int n = in();

			System.out.println(n);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

		
	}
}
