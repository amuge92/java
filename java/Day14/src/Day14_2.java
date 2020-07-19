class point {
	int d;
	int e;
String ee;
	point(int a, int b) {
		d = a;
		e = b;
	}
	public String toString() {
		return ee=d+","+e;
	}
}

public class Day14_2 {
	public static void main(String[] args) {
		point p = new point(3, 4);
		System.out.println(p);

		String j = "84111-1234560";
		int a = Integer.valueOf(j.substring(6, 7));
		switch (a) {
		case 1:
			System.out.println("남성");
			break;
		case 2:
			System.out.println("여성");
			break;
		}

	}
}
