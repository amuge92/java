import java.util.Scanner;

public class Day11_9 {
	public static void main(String[] args) {
Scanner s = new Scanner(System.in);
String a = s.next();
String b = s.next();
		int r1 = Integer.parseInt(a);
		int r2 = Integer.parseInt(b);
		System.out.println((r1*r1*r1)-(r2*r2*r2));
	}//r1^3-r2^3
}
