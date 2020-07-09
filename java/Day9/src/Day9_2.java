import java.util.Scanner;

public class Day9_2 {
	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);

//5. 무한루프안에 두 정수를 입력받아 합을 구하고, 실수를 입력하면 “실수는 안된다”라고 출력하고, 다시 두 정수를 입력받는 코드를 작성해라.
//실행 결과) 두 정수 입력: 3 3.5
//           실수는 안된다
//           두 정수 입력: 3 5
//           답: 8 
//
		int i = 0;
		int hap = 0;

		while (true) {
			System.out.println("두 정수 입력");
			try {
				int a = s.nextInt();
				int b = s.nextInt();
				System.out.println(a+b);
				break;
			} catch (Exception e) {
				System.out.println("실수는 안됨");
				s.nextLine();//입력 스트림에 있는 정수가 아닌 토큰 버리는 코드
			}
		}
	
	
	
	}
}
