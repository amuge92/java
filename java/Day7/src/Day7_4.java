import java.util.Scanner;

public class Day7_4 {
	public static void main(String[] args) {
		String str[][] = { { "book", "책" }, { "water", "물" }, { "note", "노트" } };
		Scanner s = new Scanner(System.in);
		int co = 0;
		for (int i = 0; i < str.length; i++) {
			System.out.println(str[i][0] + "의 뜻은?");
			System.out.println("정답 입력");
			String c = s.next();
			if (c.equals(str[i][1])) {
				System.out.println("정답입니다.");
			} else
				co++;
		}
		System.out.println("오답수" + co);
	}
}
