import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class Day19_7 {

	public static void main(String[] args) {
		// HashMap<K, V>//key�� ��
		HashMap<Integer, String> h = new HashMap<>();
		h.put(1, "��ö");
		h.put(2, "ȿ��");
		h.get(1);

		HashMap<String, String> ss = new HashMap<>();
		ss.put("��", "water");
		ss.put("Ŀ��", "coffee");
		ss.put("��", "tea");

		Set<String> keys = ss.keySet();
		// �� Ű�� set�÷��ǿ��� �޾ư��ڴ�.
		Iterator<String> is = keys.iterator();
		while (is.hasNext()) {
			String a = is.next();
			String b = ss.get(a);
			System.out.println(a + " " + b);

		}

		// id,��� �ΰ� ���� �־ �ؽ���
		// ����� (�ΰ�)���
		HashMap<String, Integer> idp = new HashMap<String, Integer>();

		idp.put("naver", 123456);
		idp.put("daum", 654321);
		System.out.println(idp.get("naver") + " " + idp.get("daum"));

		// �α��� �ҽ�
		HashMap log = new HashMap();

		log.put("nave", "6541");
		log.put("dau", "147896325");
		log.put("lyco", "001#@!");

		Scanner s = new Scanner(System.in);
		while (true) {
			System.out.println("���̵� ��� �Է�");
			String id = s.next();
			String bibun = s.next();
			if(!log.containsKey(id)) {
				System.out.println("���̵� ���� ���� ����");
			}
			else if(log.get(id).equals(bibun)) {
				System.out.println("�α���");
				break;
			}
			else
			System.out.println("��� Ʋ��");
			
		}

	}

}
