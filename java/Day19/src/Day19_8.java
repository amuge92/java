import java.util.HashMap;
import java.util.Scanner;

public class Day19_8 {
	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		
		HashMap<Integer,Double> hm = new HashMap<>();
		hm.put(231,231.231);
		hm.put(532,532.532);
		System.out.println("Ű �� �Է�");
		int i = s.nextInt();
		double d = s.nextDouble();
		if(!hm.containsKey(i))
			System.out.println("���� ����");
		else if(hm.get(i).equals(d)) {
			System.out.println(d);
		}
		else
			System.out.println("������");
		
		
	}
}
