import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

class Box<T> {
	T t;
	Box<T> next;

	void in(T t) {
		this.t = t;
	}

	T out() {
		return t;
	}

}

public class Day20_0 {
	public static void main(String[] args) {
//ArrayList�� ��� ����� �뷮�� �ø��� �������� �ð��� ���� �ҿ��
//������ �ʿ��� ������ ���.������ ������ ������  ==>

//LinkedList
//�迭�� ����ϴ� ��� ���μ��� ����� ������� �����͸� ������
//����� �뷮�� �ø��� ������ ������.  ������ ������ �ſ� ����. ������ ������ ����

		ArrayList<Integer> as = new ArrayList<Integer>();
		as.add(100);
		Iterator<Integer> ii = as.iterator();
		System.out.println(ii.next());

		// LinkedList ����
		Box<Integer> bi = new Box<Integer>();
		bi.in(30);
		bi.next = new Box<Integer>();
		bi.next.in(40);// ��ü�� �ѹ� �� ����
		bi.next.next = new Box<Integer>();
		bi.next.next.in(50);

		Box<Integer> tmp;
		tmp = bi.next;
		System.out.println(tmp.out());

		List<String> ls = new ArrayList<String>();
		LinkedList<String> ll = new LinkedList<String>();
		long start;
		long end;
		//��̸���Ʈ�� ��ũ�帮��Ʈ �ӵ� ��
		start = System.nanoTime();
		for (int i = 0; i < 1000; i++) {
			ls.add(0, String.valueOf(i));
		}
		end = System.nanoTime();
		System.out.println(end - start);

		start = System.nanoTime();
		for (int i = 0; i < 1000; i++) {
			ll.add(0, String.valueOf(i));
		}
		end = System.nanoTime();
		System.out.println(end - start);

	}
}
