import java.util.HashMap;
import java.util.Scanner;

public class Day19_8 {
	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		
		HashMap<Integer,Double> hm = new HashMap<>();
		hm.put(231,231.231);
		hm.put(532,532.532);
		System.out.println("키 값 입력");
		int i = s.nextInt();
		double d = s.nextDouble();
		if(!hm.containsKey(i))
			System.out.println("없는 숫자");
		else if(hm.get(i).equals(d)) {
			System.out.println(d);
		}
		else
			System.out.println("ㅇㅅㅇ");
		
		
	}
}
