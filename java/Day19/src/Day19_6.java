import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.Vector;

public class Day19_6 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		Vector<Integer> v = new Vector<Integer>();
		v.add(3);
		v.add(4);
		v.add(5);
		Iterator<Integer> vi = v.iterator();
		int hap=0;
		while(vi.hasNext()) {
			hap+=vi.next();
		}System.out.println(hap);

//		ArrayList<String> hak = new ArrayList<String>();
//		for(int i = 0;i<5;i++) {
//			hak.add(s.next());
//		}
		
		LinkedList<String> li = new LinkedList<>();
		li.add("°¡");
		li.add("³ª");
		li.add("´Ù");
		Iterator<String> sit = li.iterator();

		while (sit.hasNext()) {
			String n = sit.next();
			System.out.println(n);
		}
		
		Iterator<Integer> it = v.iterator();
		while (it.hasNext()) {
			int n = it.next();
			System.out.println(n);
		}
	}
}
