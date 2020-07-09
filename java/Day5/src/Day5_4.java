import java.util.Scanner;

public class Day5_4 {
	public static void main(String[] args) {
		char car = 'A';
		int carsu = 0;
		Scanner s = new Scanner(System.in);
		System.out.println("<1>자동차 넣기 <2>자동차 빼기 <3>끝");
		do {
			int ss = s.nextInt();
		if (ss == 1) {

			System.out.printf("%s 자동차가 터널에 들어감", car);
			car = (char) (car + 1);
			carsu++;
		}
		else if (ss == 2) {
			if(carsu<=0)
				System.out.println("빼낼 자동차가 없음");
			else {
				car = (char) (car - 1);
			System.out.printf("%s 자동차가 터널에서 빠짐", car);
			carsu--;}
		}
		else if (ss == 3) {
			System.out.printf("현재 터널에 %d대가 있음\n", carsu);
			System.out.println("프로그램을 종료합니다.");
			break;
		}}
		while (true)
			;
	}

}