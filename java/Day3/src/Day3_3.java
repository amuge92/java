import java.util.Random;

public class Day3_3 {

	public static void main(String[] args) {

		int a = (int) (Math.random() * 100) + 1;
		System.out.println(a);

		if (a %5==0&&a%10==0)
			System.out.println("a�� 5��10�� ���");
		else if (a % 5 == 0)
			System.out.println("a�� 5�� ���");
		else if (a % 10 == 0)
			System.out.println("a�� 10�� ���");
		else
			System.out.println("5�� ����� 10�� ����� �ƴϴ�");

//		int a = (int) (Math.random() * 4) + 10;
//		System.out.println(a+"��");
//        String time = (a>=10&&a<12)?"���νð�":"���ɽð�";
//        System.out.println(time);
//
//        switch(a) {
//        case 10:
//        case 11:
//        	System.out.println("����");
//        	break;
//        case 12:
//        case 13:
//        	System.out.println("����");
//        	break;
//        }
//        

//		int score = a;
//		char grade = (score>=4)?'A':'B';
		// ���ǽ� ? true ; false ���׿�����
//		System.out.println(grade);

	}

}
