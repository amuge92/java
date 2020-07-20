import java.util.Iterator;
import java.util.TreeSet;

class Pro implements Comparable<Pro> {

	String name;
	int id;

	Pro(String name, int id) {
		this.id = id;
		this.name = name;
	}

	void show() {
		System.out.println(name + " " + id);
	}

	public int compareTo(Pro o) {//오름차순
		if (id > o.id)//비교연산자 바꾸면 내림차순
			return 1;
		else if (id < o.id)
			return -1;
		return 0;
	}

}

public class Day20_4 {
	public static void main(String[] args) {
//treeSet 오름차순 
TreeSet<Pro>t = new TreeSet<>();
t.add(new Pro("가",123));
t.add(new Pro("다",789));
t.add(new Pro("나",456));
t.add(new Pro("다",789));
Iterator<Pro>ip = t.iterator();
while(ip.hasNext()) {
	ip.next().show();
}
TreeSet<Integer>grade = new TreeSet<>();
grade.add(30);
grade.add(50);
grade.add(1000);
grade.add(10);
Iterator<Integer>it = grade.iterator();
Integer min;

min=grade.first();
System.out.println(min);

Integer max=grade.last();
System.out.println(max);

max=grade.lower(new Integer(80));
System.out.println(max);
max=grade.higher(new Integer(80));
System.out.println(max);



	}
}
