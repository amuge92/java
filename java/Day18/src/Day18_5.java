//���ʸ�(������)  - >  ���ø�(������)
//<>���ʸ� ��ȣ  (angle blancket);

//�÷� �� �����ӿ�ũ(Vector,ArrayList,Map,Set)

class Java {
	String title;

	Java(String t) {
		title = t;
	}

	void show() {
		System.out.println(title);
	}
}

class DB {
	int title;

	DB(int t) {
		title = t;
	}

	void pr() {
		System.out.println(title);
	}
}

class Program<T> {// ������<> : ���ʸ� ��ȣ.....T�� �ƹ��ų�
	T a;// int a; A a;...T�� �󲮵���.int,String,class �ƹ��ų� ���ü��ִ�.

	void in(T t) {
		a = t;
	}

	T get(){
		return a;
	}

}

public class Day18_5 {
	public static void main(String[] args) {

		
//		Program<Java> T = new Program();
//		Program<DB> D = new Program();
//
//		Program<Integer> e = new Program();
//		e.in(100);
//		Integer ee = e.get();
//		
//		
//		T.in(new Java("Ÿ��Ʋ"));
//		D.in(new DB(10));
//		DB d = D.get();
//		Java j=T.get();
//	    j.show();
//	    d.pr();
//		T.get().show();		
		
//���ʸ� Ŭ���� �Ǵ� ���ʸ� �޼ҵ� 
		
		
		AA a= new AA();
		BB b= new BB();
		In i = new In();
		
		i.<AA>show(a);
		i.<BB>show(b);
		i.show();
	}
}
class AA{
	public String toString() {
	return "AA";
}
}
class BB{
	public String toString() {
		return "BB";
	}
}
class In{
	<T>void show(T t){
		System.out.println(t);
	}
	void show(){
		System.out.println(10);
	}
}