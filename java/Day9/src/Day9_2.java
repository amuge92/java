import java.util.Scanner;

public class Day9_2 {
	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);

//5. ���ѷ����ȿ� �� ������ �Է¹޾� ���� ���ϰ�, �Ǽ��� �Է��ϸ� ���Ǽ��� �ȵȴ١���� ����ϰ�, �ٽ� �� ������ �Է¹޴� �ڵ带 �ۼ��ض�.
//���� ���) �� ���� �Է�: 3 3.5
//           �Ǽ��� �ȵȴ�
//           �� ���� �Է�: 3 5
//           ��: 8 
//
		int i = 0;
		int hap = 0;

		while (true) {
			System.out.println("�� ���� �Է�");
			try {
				int a = s.nextInt();
				int b = s.nextInt();
				System.out.println(a+b);
				break;
			} catch (Exception e) {
				System.out.println("�Ǽ��� �ȵ�");
				s.nextLine();//�Է� ��Ʈ���� �ִ� ������ �ƴ� ��ū ������ �ڵ�
			}
		}
	
	
	
	}
}
