import java.util.Scanner;

public class pr2 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int a = s.nextInt();
		if (a % 2 == 1)
			System.out.println("On");
		else
			System.out.println("Off");
	}
}
