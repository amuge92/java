import java.util.Scanner;

//불러오기 
public class Day1_5 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		// 객체 생성
		// 클래스명 객체명 = new 클래스명(System.in);

		System.out.println("나이 몇이에요?");
		int age = sc.nextInt();

		System.out.println("키는 몇이에요?");
		double h = sc.nextDouble();

		System.out.println("이름은요?");
		String name = sc.next();

		System.out.println("나이는" + age + "에 키는 " + h + "이고 이름은" + name + "입니다.");

		// 정수를 입력해서 age에 대입
		// . 는 접근연산자(참조연산자)

		// int a; double b; 변수
		sc.close();
	}
}
