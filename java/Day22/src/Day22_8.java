import java.util.Scanner;
import java.util.StringTokenizer;



public class Day22_8 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		// ���ڿ��� �Է��ؼ� �� �������� �о� �������� �и��� ���� ����� ���
		String str = "���ع��� ��λ��� ������ �⵵�� �ϴ����� �����ϻ�";
		StringTokenizer st = new StringTokenizer(str," ");
		String []str2 = str.split(" ");
		System.out.println(st.countTokens());
		System.out.println(str2.length);
		
		
	}
}
