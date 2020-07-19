import java.util.Scanner;

abstract class Cal {
	protected int a, b;

	abstract int cal();

	void in() {
		Scanner s = new Scanner(System.in);
		System.out.println("두 수 입력");
		int a = 1;
		int b = 1;
		this.a = a;
		this.b = b;
	}

	void pr() {
		in();
		int r = cal();
		System.out.println("결과값 " + r);
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
		
		int r = a.compareTo(b);//문자열 비교(사전 dictionary 순)
		System.out.println(r);
			
			//StringBuffer
			//문자의 개수에 따라 버퍼 크기를 자동으로 조절할수있다. 문자열이 길거나 문자열 작업이 많은 경우.
			StringBuffer sb = new StringBuffer("java");
		    sb.append(" is very good");//맨끝에 
			sb.insert(0,"A ");
			System.out.println(sb);
			sb.replace(2, 6,"HTML");
			System.out.println(sb);
		
		
	}
}
