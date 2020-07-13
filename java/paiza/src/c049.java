import java.util.Scanner;

public class c049 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int a = s.nextInt();
		int f[] = new int[a];
		int co=0;
		int chu=1;
		for (int i = 0; i < a; i++) {
			f[i] = s.nextInt();
		     co=co+Math.abs(f[i]-chu);
		     chu=f[i];
		}System.out.println(co);

	}
}
