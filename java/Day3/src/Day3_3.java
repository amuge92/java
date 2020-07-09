import java.util.Random;

public class Day3_3 {

	public static void main(String[] args) {

		int a = (int) (Math.random() * 100) + 1;
		System.out.println(a);

		if (a %5==0&&a%10==0)
			System.out.println("a는 5와10의 배수");
		else if (a % 5 == 0)
			System.out.println("a는 5의 배수");
		else if (a % 10 == 0)
			System.out.println("a는 10의 배수");
		else
			System.out.println("5의 배수도 10의 배수도 아니다");

//		int a = (int) (Math.random() * 4) + 10;
//		System.out.println(a+"시");
//        String time = (a>=10&&a<12)?"공부시간":"점심시간";
//        System.out.println(time);
//
//        switch(a) {
//        case 10:
//        case 11:
//        	System.out.println("공부");
//        	break;
//        case 12:
//        case 13:
//        	System.out.println("점심");
//        	break;
//        }
//        

//		int score = a;
//		char grade = (score>=4)?'A':'B';
		// 조건식 ? true ; false 삼항연산자
//		System.out.println(grade);

	}

}
