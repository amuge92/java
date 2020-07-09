
public class Day7_5 {

	static void star(char a, int b) {
		int i = 1;
		while (i <= b) {
			System.out.print('*');
			i++;
		}
	}

	public static void main(String[] args) {
		star('*', 10);
	}
}
