import java.util.StringTokenizer;

public class Day14_6 {
	public static void main(String[] args) {
		String str = "id=231#124kdasg5%#@$!dfsadasfe1";
//#�� �������� ���ڿ� ������
		StringTokenizer s = new StringTokenizer(str, "#");
		System.out.println(s.countTokens());
//str�� �ִ� #�� �������� ���� ���ڿ��� ����

		while (s.hasMoreTokens()) {
			String a = s.nextToken();
			// ��ū#�� �������� ���� ���
			System.out.println(a);
		}
	}
}
