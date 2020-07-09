
public class Day1_7 {
	public static void main(String[] args) {
		System.out.printf("%d\n", 123);
		System.out.printf("%5d\n", 123);
		//5개 공간안에서 오른쪽 정렬
		System.out.printf("%-5d\n", 123);
		//5개 공간안에서 왼쪽 정렬
		System.out.printf("%05d\n", 123);

		System.out.printf("%7.1f\n", 123.45);
		System.out.printf("%7.3f\n", 123.45);
		System.out.printf("%f\n", 123.45);
	
	    System.out.printf("%s\n","안녕자바");
	    System.out.printf("%10s\n","안녕자바");
	    System.out.printf("이것을 \r덮어씁니다");

	
	   float a = 123.45f,b;
	   int c = 3 ;
	   c=(int) a;
	   b=c;
	   System.out.println(c);
			   System.out.println(b);
	
	}
}