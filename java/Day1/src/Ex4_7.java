import java.util.Scanner;
//page112
public class Ex4_7 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		/*System.out.println("������ �Է��ϼ���");
		int a = sc.nextInt();
		System.out.printf("%x\n",a);
		System.out.printf("%d",a);*/
		
		System.out.println("ù��° ��");
		double a = sc.nextDouble();
       System.out.println("<1>�� <2>�E <3>�� <4>��");
        int e = sc.nextInt();
        System.out.println("�ι��� ��");
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
