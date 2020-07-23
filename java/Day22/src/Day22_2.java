class Sh {

	private int num = 0;

	public synchronized void add() {
		int n = num;
        //Thread.yield();
		n += 10;
		num = n;
		System.out.println(num);
		
	}

}

class Student extends Thread {
	String n;Sh sh;
	Student(String n,Sh sh) {
		this.n=n;this.sh=sh;
	}
	public void  run(){
		try {
			System.out.println(n);
			 for(;;) {
				sh.add();
				sleep(1000);
			
			}
		} catch (Exception e) {
		}
	}
}

public class Day22_2 {
	public static void main(String[] args) {
		Sh sh = new Sh();
		Student th1 = new Student("jack",sh);
		Student th2 = new Student("tom", sh);
		th1.start();
		th2.start();
		}
	}

