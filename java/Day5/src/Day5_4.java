import java.util.Scanner;

public class Day5_4 {
	public static void main(String[] args) {
		char car = 'A';
		int carsu = 0;
		Scanner s = new Scanner(System.in);
		System.out.println("<1>�ڵ��� �ֱ� <2>�ڵ��� ���� <3>��");
		do {
			int ss = s.nextInt();
		if (ss == 1) {

			System.out.printf("%s �ڵ����� �ͳο� ��", car);
			car = (char) (car + 1);
			carsu++;
		}
		else if (ss == 2) {
			if(carsu<=0)
				System.out.println("���� �ڵ����� ����");
			else {
				car = (char) (car - 1);
			System.out.printf("%s �ڵ����� �ͳο��� ����", car);
			carsu--;}
		}
		else if (ss == 3) {
			System.out.printf("���� �ͳο� %d�밡 ����\n", carsu);
			System.out.println("���α׷��� �����մϴ�.");
			break;
		}}
		while (true)
			;
	}

}