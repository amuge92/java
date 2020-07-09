import java.util.Scanner;

public class c0740 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int h = s.nextInt();// 행
		int w = s.nextInt();// 렬
		double x = s.nextInt();// new열
		int hw = h * w; // 문자수
		int hwx = (int) (Math.ceil(hw / x)); // new행
		String[] newh = new String[h]; // 행 문자입력
		for (int i = 0; i < h; i++) {
			newh[i] = s.next();
		}

		String hap1 = "";
		for (int j = 0; j < h; j++) {
			for (int i = 0; i < w; i++) {
				char hap = newh[j].charAt(i);
				hap1 = hap1 + hap;
			}
		}
		int n = 0;
		String dd = "";
		for (int i = 0; i < hwx; i++) {
			dd = "";
			for (int j = 0; j < x; j++) {
				if (n == hw)
					break;
				dd = dd + hap1.charAt(n);
				n++;

			}
			System.out.println(dd);
		}
	}
}
