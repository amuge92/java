import java.util.Scanner;

class Fruit {
	void fruit() {
		System.out.println("����");
	}

}

class Apple extends Fruit {
	void apple() {
		System.out.println("���");
	}

}

class Pineaplple extends Apple {
	void pineaplple() {
		System.out.println("���ξ���");
	}
}

interface Elec {
	void pr();
}

class Ipad1 implements Elec {
	int a;
	
	Ipad1(int a) {
		this.a = a;
	}
	
	public void pr() {
		System.out.println(a+"����");
	}
}
public class Day15_5 {
	static void pr(Fruit n) {
		if (n instanceof Pineaplple) {
			((Pineaplple) n).pineaplple();
		} else if (n instanceof Apple) {
			((Apple) n).apple();
		} else
			n.fruit();
	}


	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		Elec e = new Ipad1(80);// Elec�������̽� pr()�߻�޼ҵ�
		e.pr();

		
		Fruit f = new Fruit();
		Apple a = new Apple();
		Pineaplple p = new Pineaplple();
		pr(f);
		pr(a);
		pr(p);
	}
}
