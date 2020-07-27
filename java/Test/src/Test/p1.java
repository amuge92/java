package Test;

import java.util.Scanner;

public class p1 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int si,jon,go,an;
		int []s1 = new int [n];
		int []e = new int [n];
		int []h = new int [n];
		int []l = new int [n];
		go=0;
		an = 2099999999;
		for (int i = 0; i < n; i++) {
			s1[i] = s.nextInt();
			e[i] = s.nextInt();
			h[i] = s.nextInt();
			l[i] = s.nextInt();
			if(an>s1[i])
				an=s1[i];
			if(an>e[i])
				an=e[i];
			if(an>h[i])
				an=h[i];
			if(an>l[i])
				an=l[i];
			if(go<s1[i])
				go=s1[i];
			if(go<e[i])
				go=e[i];
			if(go<h[i])
				go=h[i];
			if(go<l[i])
				go=l[i];
		}
		si=s1[0];
		jon = e[n-1];

		System.out.println(si+" "+jon+" "+go+" "+an);
	}
}
