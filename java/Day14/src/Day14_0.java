import java.util.Arrays;

interface IT {
	void java();
}

class Student {
	public void study(IT it) {
		it.java();
	}

}

class ITStudent implements IT {
	public void java() {
		System.out.println("자바 공부");
	}

}

class DBStudent implements IT {
	public void java() {
		System.out.println("데이터 베이스 공부");
	}

}

public class Day14_0 {
	public static void main(String[] args) {

		Student sd = new Student();
		ITStudent it1 = new ITStudent();
		DBStudent db = new DBStudent();
		sd.study(it1);

		Integer i1 = 100; // 오토 박싱 integer i new integer(100);
		int n = i1; // 오토 언박싱

		Integer i = new Integer(10);
		// 문자 'a'객체화
		// 불린값 true 객체화ㅗ
		Boolean d = new Boolean(true);
		d = d.booleanValue();
		Character e = new Character('a');
				e = e.charValue();
	
	}
}
