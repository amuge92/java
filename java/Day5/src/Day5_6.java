import java.util.Scanner;

public class Day5_6 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int ary[] = new int[5];
		int hap = 0;
		for (int i = 0; i < 5; i++) {
			System.out.println((i + 1) + "Ãþ¿£ ¸î¸íÀÌ »ç³ª");
			ary[i] = s.nextInt();
			hap += ary[i];
		}
		System.out.println("1ÃþºÎÅÍ 5Ãþ±îÁö ÃÑ ÁÖ¹Î¼ö " + hap);
	}
}
