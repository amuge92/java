class Food {
	void show() {
		System.out.println("����");
	}
}

class Pizza extends Food {
	void show() {
		super.show();
		System.out.println("����");
	}

}

class Fo<T> {
	T t;

	void set(T t) {
		this.t = t;
	}

	T get() {
		return t;
	}
}

public class Day20_5 {
//Ŭ���� ����
	static void pr(Fo<? extends Food> f) { //Food���� ��ӹ޴� Ŭ������ Fo<>�ȿ� �����ֵ�. �ݴ�� super{
         Food fo = f.get();
         fo.show();
	}

	public static void main(String[] args) {

		Fo<Pizza> fp = new Fo();
		Pizza p = new Pizza();
		fp.set(p);
		pr(fp);
		
	}
}
