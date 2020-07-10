class In1 {
	private int num;

	In1(int num) {
		this.num = num;
	}

	public String toString() {
		return num +"";
	}

}

public class Day13_9 {
public static void main(String[] args) {
	In1 a = new In1(2);
	System.out.println(a.toString());
}
}
