import java.util.Scanner;

abstract class Cal {
	protected int a, b;

	abstract int cal();

	void in() {
		Scanner s = new Scanner(System.in);
		System.out.println("�� �� �Է�");
		int a = 1;
		int b = 1;
		this.a = a;
		this.b = b;
	}

	void pr() {
		in();
		int r = cal();
		System.out.println("����� " + r);
	}

}

class Multi extends Cal {
	int cal() {
		return a * b;
	}
}

class Div extends Cal {
	int cal() {
		return a / b;
	}
}

public class Day15_1 {
	public static void main(String[] args) {

		Multi m = new Multi();
		Div d = new Div();
		m.pr();
		d.pr();

		
		String a="java";
		String b="DB";
		
		int r = a.compareTo(b);//���ڿ� ��(���� dictionary ��)
		System.out.println(r);
			
			//StringBuffer
			//������ ������ ���� ���� ũ�⸦ �ڵ����� �����Ҽ��ִ�. ���ڿ��� ��ų� ���ڿ� �۾��� ���� ���.
			StringBuffer sb = new StringBuffer("java");
		    sb.append(" is very good");//�ǳ��� 
			sb.insert(0,"A ");
			System.out.println(sb);
			sb.replace(2, 6,"HTML");
			System.out.println(sb);
		
		
	}
}
