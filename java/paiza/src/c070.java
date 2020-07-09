import java.util.Scanner;

public class c070 {
	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		String[] s1 = new String[n];
		int[] co = new int[4];
		for (int i = 0; i < n; i++) {
			String ss = s.next();
			s1 = ss.split("");
			co[0] = 0;
			co[1] = 0;
			co[2] = 0;
			co[3] = 0;
			for (int j = 0; j < 3; j++) {
				for (int x = 1 + j; x < 4; x++) {
					if (s1[j].equals(s1[x])) {
						co[j]++;
					}
				}
				if (co[j] == 3) {
					System.out.println("Four Card");
					j = 3;
					continue;
				} else if (co[j] == 2) {
					System.out.println("Three Card");
					j = 3;
					continue;
				}

				if (co[0] == 1 && (co[0] == co[1] || co[0] == co[2] || co[0] == co[3])) {
					System.out.println("Two Pair");
				} else if (co[1] == 1 && (co[1] == co[2] || co[1] == co[3])) {
					System.out.println("Two Pair");

				} else if (co[2] == 1 && co[2] == co[3]) {
					System.out.println("Two Pair");
				}

			}
			if (co[0] == 1 && !(co[1] == 1) && !(co[2] == 1) && !(co[3] == 1)) {
				System.out.println("One Pair");
				continue;
			} else if (co[1] == 1 && !(co[0] == 1) && !(co[2] == 1) && !(co[3] == 1)) {
				System.out.println("One Pair");
				continue;
				
			} else if (co[2] == 1 && !(co[1] == 1) && !(co[0] == 1) && !(co[3] == 1)) {
				System.out.println("One Pair");
				continue;
			} else if (co[3] == 1 && !(co[1] == 1) && !(co[2] == 1) && !(co[0] == 1)) {
				System.out.println("One Pair");
				continue;
			}
			if (co[0] == 0 && co[1] == 0 && co[2] == 0 && co[3] == 0)
				System.out.println("No Pair");
		}

	}
}
