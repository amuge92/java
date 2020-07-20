import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class Day20_3 {
	public static void main(String[] args) {
		Scanner s2 = new Scanner(System.in);
//		HashMap<String, Integer> hs = new HashMap<String, Integer>();
//
//		for (int i = 0; i < 3; i++) {
//			hs.put(s.next(), s.nextInt());
//		}
//
//		Set<String> key = hs.keySet();
//		Iterator<String> ik = key.iterator();
//		int max = 0;
//		String str = "";
//		while (ik.hasNext()) {
//			String name = ik.next();
//			int age = hs.get(name);
//			if (max < age) {
//				max = age;
//				str = name;
//			}
//
//		}
//System.out.println(str+" "+max);

//		HashSet<Num> h = new HashSet<Num>();
//		h.add(new Num(3));
//		h.add(new Num(7));
//		h.add(new Num(3));
//		Iterator<Num> it = h.iterator();
//		while (it.hasNext()) {
//			System.out.println(it.next());
//		}

		
		Set<Stu> s= new HashSet<Stu>();
		s.add(new Stu("용석",24));
		s.add(new Stu("유강",22));
		s.add(new Stu("유강",22));
		System.out.println(s.size());
		
		
		
		
	}
}
class Stu{
	String name;int age;
	Stu(String n,int a){
		name=n;age=a;
	}
	public int hashCode() {
		return name.hashCode()+age;
	}
	public boolean equals(Object obj) {
		Stu s1 = (Stu) obj;
		return s1.name.equals(name)&&s1.age==age;
		
	}
	
}





class Num {
	int a;
	Num(int a) {
		this.a = a;
	}
	public String toString(){
		return a+"";
	}

	public int hashCode() {
		return a % 3;

	}
	public boolean equals(Object obj) {
		Num num= (Num) obj;
		if(num.a==a)
		return true;
		else
		return false;
		
	}
}