//제너릭(모형자)  - >  템플릿(모형자)
//<>제너릭 기호  (angle blancket);

//컬렉 션 프레임워크(Vector,ArrayList,Map,Set)

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

class Program<T> {// 모형자<> : 제너릭 기호.....T는 아무거나
	T a;// int a; A a;...T는 빈껍데기.int,String,class 아무거나 들어올수있다.

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
//		T.in(new Java("타이틀"));
//		D.in(new DB(10));
//		DB d = D.get();
//		Java j=T.get();
//	    j.show();
//	    d.pr();
//		T.get().show();		
		
//제너릭 클래스 또는 제너릭 메소드 
		
		
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