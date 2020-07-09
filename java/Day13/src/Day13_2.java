import java.util.Scanner;

class XY {
	int a, b;

	void set(int a, int b) {
		this.a = a;
		this.b = b;
	}

	void show() {
		System.out.println(a + " " + b);
	}
}

class XYZ extends XY {
	String color;

	void color(String color) {
		this.color = color;
	}

	void show() {
		System.out.println(a + " " + b + " " + color);
	}
}

public class Day13_2 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		XY x = new XY();
		x.set(1, 2);
		x.show(); // 1,2 ���
		XYZ xy = new XYZ();
		xy.set(4, 5);
		xy.color("blue");
		xy.show(); // 4,5,blue ���

//		4. �� ����� ������������ �Ѵ�. ����,����,�� �� �ϳ��� ���ڿ��� �Է¹޾� ���� �̰���� �Ǵ��ϴ� ���α׷����ۼ��ض�.(��ø if�� ����ؾ���, ���ڿ� ��)
//		������) ���� : ����
//		             ö�� : ��
//		              ö���� �̰��.
		String a = s.next();
		String b = s.next();
		System.out.println("���� : " + a);
		System.out.println("ö�� : " + b);

		if (a.equals("����")) {
			if (b.equals("����"))
				System.out.println("�� ����� ����.");
			else if (b.equals("����"))
				System.out.println("������ �̰��.");
			else if (b.equals("��"))
				System.out.println("ö���� �̰��.");
		} else if (a.equals("����")) {
			if (b.equals("����"))
				System.out.println("ö���� �̰��.");
			else if (b.equals("����"))
				System.out.println("�� ����� ����.");
			else if (b.equals("��"))
				System.out.println("������ �̰��.");
		} else if (a.equals("��")) {
			if (b.equals("����"))
				System.out.println("������ �̰��.");
			else if (b.equals("����"))
				System.out.println("ö���� �̰��.");
			else if (b.equals("��"))
				System.out.println("�� ����� ����.");
		}
	}

}
