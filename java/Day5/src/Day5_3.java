import java.util.Scanner;

public class Day5_3 {
	public static void main(String[] args) {
//		숫자를 입력하여 정답 숫자 맞추는 게임
//		정답을18로 설정
//		입력한숫자가 정답(18)이 아닐 경우 크거나 작은지 알려준다. 정답을맞출 때까지 숫자 입력을 반복하고 정답을 맞춘 후에는 시도한 횟수 출력
//		실행결과) 숫자 입력: 25
//		           25보다 작다!!
//		          숫자 입력: 10
//		          10보다 크다!!
//		          숫자 입력: 18
//		          정답이다!!
//		         시도한 횟수는 3번이다.
		Scanner s = new Scanner(System.in);
		int answer = 18;
		int co = 0;
		System.out.println("숫자 입력");
		while (true) {
			int su = s.nextInt();
			co++;
			if (su == 18) {
				System.out.println("정답");
				break;
			} //
			if (su > 18) {
				System.out.println(su + "보다 작다");
			}
			if (su < 18) {
				System.out.println(su + "보다 크다");
			}
		}System.out.println("시도 횟수"+co);
	}
}
//		JDK에는JRE가 포함되는가?
//		JVM은 무엇인가?
