import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class Day19_7 {

	public static void main(String[] args) {
		// HashMap<K, V>//key와 값
		HashMap<Integer, String> h = new HashMap<>();
		h.put(1, "승철");
		h.put(2, "효준");
		h.get(1);

		HashMap<String, String> ss = new HashMap<>();
		ss.put("물", "water");
		ss.put("커피", "coffee");
		ss.put("차", "tea");

		Set<String> keys = ss.keySet();
		// 모른 키를 set컬랙션에서 받아가겠다.
		Iterator<String> is = keys.iterator();
		while (is.hasNext()) {
			String a = is.next();
			String b = ss.get(a);
			System.out.println(a + " " + b);

		}

		// id,비번 두개 정도 넣어서 해쉬맵
		// 비번만 (두개)출력
		HashMap<String, Integer> idp = new HashMap<String, Integer>();

		idp.put("naver", 123456);
		idp.put("daum", 654321);
		System.out.println(idp.get("naver") + " " + idp.get("daum"));

		// 로그인 소스
		HashMap log = new HashMap();

		log.put("nave", "6541");
		log.put("dau", "147896325");
		log.put("lyco", "001#@!");

		Scanner s = new Scanner(System.in);
		while (true) {
			System.out.println("아이디 비번 입력");
			String id = s.next();
			String bibun = s.next();
			if(!log.containsKey(id)) {
				System.out.println("아이디가 존재 하지 않음");
			}
			else if(log.get(id).equals(bibun)) {
				System.out.println("로그인");
				break;
			}
			else
			System.out.println("비번 틀림");
			
		}

	}

}
