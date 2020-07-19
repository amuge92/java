class Num {
	int n;

	Num(int n) {
		this.n = n;
	}

	int getnum() {
		return n;
	}

}

public class Day14_7 {
	public static void main(String[] args) {

		Num[] aryr = new Num[] 
				{ new Num(1), new Num(2), new Num(3)};

		for(Num n : aryr)
		{System.out.println(n.getnum());}		
		
		int[] ary = { 1, 2, 3, 4, 5 };
		int sum = 0;
		// for each
		for (int i : ary) {
			sum += i;
		}
		System.out.println(sum);

	}
}
