
public class Day5_1 {
	public static void main(String[] args) {
		int[] ballarr = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		int[] ball3 = new int[3];
		for (int i = 0; i < ballarr.length;i++) {
			int j = (int) (Math.random() * ballarr.length);
			int tem = 0;

			// 1
			tem = ballarr[i];
			ballarr[i] = ballarr[j];
			ballarr[j] = tem;
		}

		for (int i = 0; i <= 2; i++) {
			ball3[i] = ballarr[i];
		}

		for (int i = 0; i < ball3.length; i++) {
			System.out.println(ball3[i]);
		}
		System.out.println();
	}
}
