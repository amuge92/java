class Circle {
	double r;
	int a;

	Circle() {
	}

	Circle(int a) {
		this.a = a;
		r = a * a * 3.14;
	}

	public String toString() {
		return a + "";
	}

	public boolean equals(Circle ob) {
		if (this.a == ob.a) {// Object ob ((Circle)ob).n {
			return true;
		}
		return false;

	}
}

interface Po {
	void pr(String b) ;
	void pr(int a,String b) ;
	
}

class Point implements Po {
	int a;
	String b;
	public void pr(int a, String b) {
		System.out.println(b + "책은 " + a + "원");
	}

	public void pr(String b) {
		System.out.println(b);
	}}


abstract class Ab{
	abstract String pr(char a,int b);
}
class Aa extends Ab{
	String pr(char a,int b){
		String d = "";
		for(int i=0;i<b;i++) {
			d=d+a;
		}return d;
	}
}

public class Day15_4 {
	public static void main(String[] args) {
		
		
		Ab a = new Aa();
		System.out.println(a.pr('$',10));
		
		
		Po p=new Point();
        p.pr(30000,"java");  
        p.pr("python"); 
		
		
		Double d = new Double(9.5);
		String dd = d.toString();
		double ddd = Double.parseDouble(dd);

		Circle aa = new Circle(30);
		Circle b = new Circle(30);
		System.out.println("반지름" + aa);
		System.out.println("반지름" + b);
		if (a.equals(b)) {
			System.out.println("같은 원");
		} else {
			System.out.println("다른 원");
		}
	}

}
