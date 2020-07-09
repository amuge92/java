
public class Day1_0 {

	public static void main(String[] args) {

		System.out.printf("나이 : %d살\n", 10); // %d는 정수만
		System.out.printf("키 : %.2fcm\n", 150.3); // %f 실수
		System.out.printf("학점 : %c\n", 'A'); // %c 하나의 문자 작은 따옴표
		System.out.printf("이름 : %s\n", "홍길동");// %s 문자열

		System.out.println("100+100");
		System.out.println(100 + 100);
		System.out.println("100" + "100");
		System.out.printf("\n");
		System.out.printf("%d\n", 100 + 100);
		System.out.printf("%d %d\n", 100 + 100,1);
		System.out.printf("%d/%d=%.1f\n",100,200,0.5);
	}

}
