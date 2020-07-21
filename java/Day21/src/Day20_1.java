import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;

public class Day20_1 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
//		1. LinkedList�� ��one��,��two��,��three���� �����Ѵ�. 
//		���� �� Iterator�� �ݺ��� ��(while) ��three����� �ܾ ���̸�(comepareTo�Լ� ���) �����ض�.

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

//		2. HashMap�� (1,��one��),(2,��two��),(3,��three��)�� �����Ͽ� Ű, ���� �� ����Ѵ�.��� ��, 
//		1�� �Է��ϸ� one, 2�� �Է��ϸ� two, 3�� �Է��ϸ� three�� ��µ� �� �ְԲ� �ڵ带 �ۼ��ض�.

		HashMap<Integer, String> hm = new HashMap<Integer, String>();

		hm.put(1, "one");
		hm.put(2, "two");
		hm.put(3, "three");
		System.out.println(hm.toString());
		for (;;) {
			System.out.println("Ű �Է�");
			int n = s.nextInt();
			if (!hm.containsKey(n))
				System.out.println("Ű ����");
			System.out.println(hm.get(n));
			break;

		}

	}
}
