import java.util.Scanner;

public class C017 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		
		int a = sc.nextInt();//�θ�ī��
		int b = sc.nextInt();
		int n = sc.nextInt();//���� n
		int a1,b1;//�ڽ� ī��
		for(int i = 0 ; i<n;i++) {
			a1=sc.nextInt();
			b1=sc.nextInt();
			if(a==a1) {
				System.out.println(b>b1?"Low":"High");
			}
			else {
				System.out.println(a<a1?"Low":"High");
			}
		}
	}
}
