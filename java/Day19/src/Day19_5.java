import java.util.ArrayList;
import java.util.Scanner;
import java.util.Vector;

class Xy {
	private int x, y;

	Xy(int x, int y) {
		this.x = x;
		this.y = y;

	}
	public String toString(){
		return x+""+y;
	}
}

public class Day19_5 {
	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		ArrayList<String> str = new ArrayList<>();
		for(int i = 0; i < 4; i++) {
			str.add(s.next());
			str.get(i);
		}
		Vector<Integer> vi = new Vector<Integer>();
		for(int i = 0; i < 5; i++) {
			vi.add(s.nextInt());
		}int min = vi.get(0);
		for(int i = 0; i < 5; i++) {
			if(min>vi.get(i))
				min=vi.get(i);
		}System.out.println(min);
		
		
		str.add("��");
		str.add("��");
		str.add("��");
		str.add("��");
		for(int i = 0; i < str.size(); i++) {
			System.out.println(str.get(i));
			
		}
		
		Vector<Xy> v = new Vector<Xy>();
		v.add(new Xy(1,2));
		v.add(new Xy(3,4));
		v.add(new Xy(5,6));
		v.add(new Xy(7,8));
		
		v.remove(2);
		for(int i = 0; i < v.size(); i++) {
			System.out.println(v.get(i));
			
		}
//		Vector<Integer> v = new Vector<>();
//		v.add(new Integer(5));// �⺻ ���� 5�� ��üȭ���� ���Ϳ� ����.
//		v.add(5);
//		v.add(6);
//		v.add(0, 20);// �ε��� 0�� 20�� �ְڴ�.
//		System.out.println(v.size());
//
//		for (int i = 0; i < v.size(); i++) {
//			System.out.println(v.get(i));

//		}

	}
}
