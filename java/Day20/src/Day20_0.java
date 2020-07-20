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
//ArrayList의 담긴 저장소 용량을 늘리는 과정에서 시간이 많이 소요됨
//삭제에 필요한 과정이 길다.데이터 참조가 빠르다  ==>

//LinkedList
//배열을 사용하는 대신 서로서로 연결된 방식으로 데이터를 저장함
//저장소 용량을 늘리는 과정이 빠르다.  데이터 삭제가 매우 간단. 데이터 참조가 불편

		ArrayList<Integer> as = new ArrayList<Integer>();
		as.add(100);
		Iterator<Integer> ii = as.iterator();
		System.out.println(ii.next());

		// LinkedList 형식
		Box<Integer> bi = new Box<Integer>();
		bi.in(30);
		bi.next = new Box<Integer>();
		bi.next.in(40);// 객체에 한번 더 접근
		bi.next.next = new Box<Integer>();
		bi.next.next.in(50);

		Box<Integer> tmp;
		tmp = bi.next;
		System.out.println(tmp.out());

		List<String> ls = new ArrayList<String>();
		LinkedList<String> ll = new LinkedList<String>();
		long start;
		long end;
		//어레이리스트와 링크드리스트 속도 비교
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
