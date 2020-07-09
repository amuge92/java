import java.util.Scanner;

public class Day2_1 {
	public static void main(String[] args) {
		Scanner cs = new Scanner(System.in);
	    System.out.println("연도 입력");
	    int a = cs.nextInt();
	    
	    if((a%4==0)&&(a%100!=0)||(a%400==0)) {
	    	System.out.println(a + "년은 윤년");
	    	
	    }
	    else {System.out.println("윤년이 아니다");}

	
	}

              
}
