import java.util.Scanner;

public class Day5_3 {
	public static void main(String[] args) {
//		���ڸ� �Է��Ͽ� ���� ���� ���ߴ� ����
//		������18�� ����
//		�Է��Ѽ��ڰ� ����(18)�� �ƴ� ��� ũ�ų� ������ �˷��ش�. ���������� ������ ���� �Է��� �ݺ��ϰ� ������ ���� �Ŀ��� �õ��� Ƚ�� ���
//		������) ���� �Է�: 25
//		           25���� �۴�!!
//		          ���� �Է�: 10
//		          10���� ũ��!!
//		          ���� �Է�: 18
//		          �����̴�!!
//		         �õ��� Ƚ���� 3���̴�.
		Scanner s = new Scanner(System.in);
		int answer = 18;
		int co = 0;
		System.out.println("���� �Է�");
		while (true) {
			int su = s.nextInt();
			co++;
			if (su == 18) {
				System.out.println("����");
				break;
			} //
			if (su > 18) {
				System.out.println(su + "���� �۴�");
			}
			if (su < 18) {
				System.out.println(su + "���� ũ��");
			}
		}System.out.println("�õ� Ƚ��"+co);
	}
}
//		JDK����JRE�� ���ԵǴ°�?
//		JVM�� �����ΰ�?
