import java.util.Scanner;
//page112
public class Ex4_7 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		/*System.out.println("정수를 입력하세요");
		int a = sc.nextInt();
		System.out.printf("%x\n",a);
		System.out.printf("%d",a);*/
		
		System.out.println("첫번째 값");
		double a = sc.nextDouble();
       System.out.println("<1>덧 <2>뺼 <3>곱 <4>나");
        int e = sc.nextInt();
        System.out.println("두번재 값");
        double b = sc.nextDouble();
        if(e==1) {
        	System.out.println(a + " + " + b+" = " +(a + b));
        }
        else if(e==2) {System.out.println(a + " - " + b+" = " +(a - b));
        }
        else if(e==3) {System.out.println(a + " * " + b+" = " +(a * b));
        }
        else if(e==4) {System.out.println(a + " / " + b+" = " +(a / b));
        }
        else {System.out.println("error");}	
	
	
	}
}
