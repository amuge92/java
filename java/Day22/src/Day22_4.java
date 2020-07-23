import java.util.Set;
import java.util.TreeSet;

class Coffee {
	int price, num;

	Coffee(int p, int n) {
		price = p;
		num = n;
	}

	int total() {
		return price * num;
	}

}

public class Day22_4 {
	public static void main(String[] args) {

		Coffee[] c = new Coffee[3];
		c[0]=new Coffee(3500, 1);
		c[1]=new Coffee(4900, 2);
		c[2]=new Coffee(2000, 3);
		int hap=0;
		for(Coffee a :c) {
			hap +=a.price;
		}System.out.println(hap);
	
	
		

	}

}
