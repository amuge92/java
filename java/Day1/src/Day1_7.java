
public class Day1_7 {
	public static void main(String[] args) {
		System.out.printf("%d\n", 123);
		System.out.printf("%5d\n", 123);
		//5�� �����ȿ��� ������ ����
		System.out.printf("%-5d\n", 123);
		//5�� �����ȿ��� ���� ����
		System.out.printf("%05d\n", 123);

		System.out.printf("%7.1f\n", 123.45);
		System.out.printf("%7.3f\n", 123.45);
		System.out.printf("%f\n", 123.45);
	
	    System.out.printf("%s\n","�ȳ��ڹ�");
	    System.out.printf("%10s\n","�ȳ��ڹ�");
	    System.out.printf("�̰��� \r����ϴ�");

	
	   float a = 123.45f,b;
	   int c = 3 ;
	   c=(int) a;
	   b=c;
	   System.out.println(c);
			   System.out.println(b);
	
	}
}