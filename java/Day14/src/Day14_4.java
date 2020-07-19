import java.util.Scanner;

class XY {

	private int x, y;

	XY(int x, int y) {
		this.x = x;
		this.y = y;
	}

	int getx() {
		return x;
	}

	int gety() {
		return y;
	}

	protected void move(int x, int y) {
		this.x = x;
		this.y = y;
	}
}

class XYZ extends XY {
	String z;

	XYZ(int x, int y) {
		super(x, y);}

	XYZ(int x, int y, String z) {
		super(x, y);
		this.z = z;}

	void setcolor(String a) {
		z = a;}

	void setxy(int x, int y) {
		move(x, y);}

	void show() {
		System.out.println(getx() + "," + gety() + "ÀÎ" + z + "»ö");}}

public class Day14_4 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		XYZ xyz = new XYZ(10, 10, "red");
		xyz.setxy(20, 30);
		xyz.setcolor("blue");
		xyz.show();
	}
}
