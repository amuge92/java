import java.util.Scanner;

public class Day3_2 {

	public static void main(String[] args) {

		int n = (int) (Math.random() * 6) + 1;


       switch(n) { 
       
       case 1:
       System.out.println("one");
		break;
       case 5:
    	   System.out.println("five");
    	   break;
       case 6:
    	   System.out.println("six");}
       
		// 0.0*10.<= math.random()*10 <1.0*10
		// 0.0 <= math.random()*10 <10.0
		// 1.0 <= math.random()*10+1 <11.0
	}
}
