class In {
	int num;

	In(int num) {
		this.num = num;
	}

	boolean eq(In i) {
		if (this.num == i.num)
			return true;
		return false;
	}
}

public class Day13_8 {
	public static void main(String[] args) {

		In a = new In(1
				);
		In b = new In(2);
		In c = new In(3);
		if(a.eq(b))
			System.out.println("a,b는 동일");
		else
			System.out.println("a,b는 다름");

	}
}
