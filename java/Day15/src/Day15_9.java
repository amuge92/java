
class Student extends Thread {

	Pr p = new Pr();
	String[] str;

	Student(Pr p, String[] str) {
		this.p = p;
		this.str = str;

	}

	public void  run() {

		for (int i = 0; i < str.length; i++) {
			p.pr(str[i]);
		}

	}

}

class Pr {
	synchronized void pr(String str) {
		for (int i = 0; i < str.length(); i++) {
			System.out.print(str.charAt(i));
		}System.out.println();
		

	}

}

public class Day15_9 {
	public static void main(String[] args) {

		Pr p  = new Pr();
		String []eng= {"apple","banana","cocoa"};
		String []kor= {"사과","바나나","코코아"};
		Thread t1 = new Student(p, eng);
		Thread t2 = new Student(p, kor);
		t1.start();
		t2.start();
		
		
		
		
		
		
		
	}
}
