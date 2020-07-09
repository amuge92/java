
public class Day3_4 {
	public static void main(String[] args) {

		int a = (int) (Math.random() * 20) + 81;
		System.out.println(a);
		// 81부터 100까지

		String grade;

		if (a >= 90) {
			if (a >= 95) {
				grade = "A+";
			} else {
				grade = "A";
			}

		} else {
			if (a >= 85) {
				grade = "B+";

			} else
				grade = "B";
		}
		System.out.println(grade);
	}

}
