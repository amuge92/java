import java.util.Scanner;

class Num extends Exception {
	Num() {
		super("잘못된 값!!");

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

		System.out.println("양수를 입력해라");
		try {
			int n = in();

			System.out.println(n);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

		
	}
}
