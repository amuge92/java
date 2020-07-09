import java.util.Scanner;

public class Day6_0 {
	private static final String[][] String = null;

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int hap = 0;
		int i = 0;
// 1번 문제
		for (i = 0; i <= 10; i++) {
			hap = hap + i;
		}
		System.out.println("1," + hap);

		while (i <= 10) {
			hap += i;
			i++;
		}
		System.out.println("1," + hap);
		i = 0;
		hap = 0;
		do {
			hap += i;
			i++;
		} while (i <= 10);
		System.out.println("1," + hap);
//2번문제
		hap = 0;
		double co = 0;
		while (true) {
			int j = s.nextInt();
			co++;
			hap += j;
			if (j == 0)
				break;
		}
		System.out.println("2," + hap / co);
//3번문제
		int sum = 0;
		i = 0;
		while (i < 10) {
			i += 2;
			sum += i;
		}
		System.out.println("3," + sum);

		sum = 0;
		for (i = 0; i <= 10; i += 2)
			sum += i;
		System.out.println("3," + sum);
		i = 0;
		sum = 0;
		// 3-1번문제
		while (true) {
			sum += i;
			if (i == 10)
				break;
			i += 2;
		}
		System.out.println(sum);

		i = 0;
		sum = 0;
		// 3-2번문제
		do {
			i += 2;
			sum += i;

		} while (i < 10);
		System.out.println(sum);
		i = 0;
		sum = 0;
		for (;;) {
			i += 2;
			sum += i;
			if (i < 10)
				continue;
			else
				break;
		}
		System.out.println(sum);
//4번문제
		String[] arr = new String[10];
		int[] arri = new int[5];
		String[] c = { "Java", "c", "c++" };
		int[] d = new int[10];

	}

}
