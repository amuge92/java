abstract class Ca {

	abstract int add(int a, int b);

	abstract int avg(int[] a);
}

class Cal extends Ca {
	int add(int a, int b) {
		return a + b;
	}

	int avg(int[] a) {
		int hap = 0;
		for (int i = 0; i < a.length; i++) {
			hap = hap + a[i];

		}
		return hap / a.length;

	}
}

public class Day12_7 {
	public static void main(String[] args) {

		Cal c = new Cal();
		System.out.println(c.add(3, 7));
		System.out.println(c.avg(new int[] { 1, 2, 3 }));
	}
}
