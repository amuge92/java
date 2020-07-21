import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;

public class Day20_1 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
//		1. LinkedList에 “one”,”two”,”three”를 저장한다. 
//		저장 후 Iterator로 반복한 후(while) “three”라는 단어가 보이면(comepareTo함수 사용) 삭제해라.

		LinkedList<String> l = new LinkedList<String>();
		l.add("one");
		l.add("two");
		l.add("three");
		l.add("four");
		Iterator<String> it = l.iterator();
		while (it.hasNext()) {
			String a = it.next();
			if (a.compareTo("three") == 0) {
				it.remove();
				a = "";
			}
			System.out.println(a);
		}

//		2. HashMap에 (1,”one”),(2,”two”),(3,”three”)를 저장하여 키, 값을 다 출력한다.출력 후, 
//		1을 입력하면 one, 2를 입력하면 two, 3을 입력하면 three가 출력될 수 있게끔 코드를 작성해라.

		HashMap<Integer, String> hm = new HashMap<Integer, String>();

		hm.put(1, "one");
		hm.put(2, "two");
		hm.put(3, "three");
		System.out.println(hm.toString());
		for (;;) {
			System.out.println("키 입력");
			int n = s.nextInt();
			if (!hm.containsKey(n))
				System.out.println("키 없음");
			System.out.println(hm.get(n));
			break;

		}

	}
}
