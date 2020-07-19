import java.util.Scanner;

public class Day19_3 {
	public static void main(String[] args) {
Scanner s = new Scanner(System.in);

		Gen<String> a = new Gen<String>("seoul", "busan");
		a.one();
		a.two();
		a.three();
		
		Cal c= new Show();
		System.out.println(c.cal(s.nextInt(),s.nextInt()));
	}
}

interface Cal {
	int cal(int a, int b);
}

class Show implements Cal {
	int hap = 0;

	public int cal(int a, int b) {
		for (int i = a; i <= b; i++) {
			hap += i;
		}
		return hap;
	}
}

class Gen<T> {
	T t, t2;
	Gen(T t, T t2) {
		this.t = t;
		this.t2 = t2;
	}
	void one() {
		System.out.println(t);
	}
	void two() {
		System.out.println(t2);
	}
	void three() {
		System.out.println(t.equals(t2));
	}
}