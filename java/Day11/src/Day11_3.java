class XY {
	private int x, y;

	void set(int x, int y) {
		this.x = x;// √ ±‚»≠
		this.y = y;
	}

	void show() {
		System.out.println(x + " " + y);
	}
}

class XYZ extends XY {

	private String name;

	void setname(String name) {
		this.name = name;
	}

	void pr() {
		System.out.println(name);
		show();
	}

}

public class Day11_3 {
	public static void main(String[] args) {

		XY s = new XY();
		XYZ ss = new XYZ();
		ss.set(30, 30);
		s.set(10, 30);
		ss.setname("d");
		ss.pr();
	}

}
