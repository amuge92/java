import java.util.Scanner;

public class c0740 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int h = s.nextInt();// ��
		int w = s.nextInt();// ��
		double x = s.nextInt();// new��
		int hw = h * w; // ���ڼ�
		int hwx = (int) (Math.ceil(hw / x)); // new��
		String[] newh = new String[h]; // �� �����Է�
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
