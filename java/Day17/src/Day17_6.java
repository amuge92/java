import java.util.Scanner;

enum Pro {

	JAVA(20), C(10), PYTHON(15);// ������ Ŭ������ ��ü..

	int n;

	Pro(int n) {

		this.n = n;

	}

	int get() {
		return n;
	}
}

public class Day17_6 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("���� ����");
		String n = s.next();

		Pro p = Pro.valueOf(Pro.class,n);
		//������ �ν��Ͻ� �˾Ƴ��� �ڵ�
		//���ڿ� ��ü��ȯ

		switch(p) {
		case JAVA:
			System.out.println(p.get());
			break;
		case PYTHON:
			System.out.println(p.get());
			
			break;
		case C:
			System.out.println(p.get());
			
			break;
		
		
		
		
		}
		
	}

}
