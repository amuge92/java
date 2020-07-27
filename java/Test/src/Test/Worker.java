package Test;

import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;
import java.util.Vector;

public class Worker {
	private int a1;
	private String n;
	private String d;
	private String ad;

	public int getA1() {
		return a1;
	}

	public void setA1(int a1) {
		this.a1 = a1;
	}

	public String getN() {
		return n;
	}

	public void setN(String n) {
		this.n = n;
	}

	public String getD() {
		return d;
	}

	public void setD(String d) {
		this.d = d;
	}

	public String getAd() {
		return ad;
	}

	public void setAd(String ad) {
		this.ad = ad;
	}

	public String getBir() {
		return bir;
	}

	public void setBir(String bir) {
		this.bir = bir;
	}

	private String bir;

	Worker(int a1, String n, String d, String ad, String bir) {
		this.a1 = a1;
		this.n = n;
		this.d = d;
		this.ad = ad;
		this.bir = bir;
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		HashMap<Integer, Worker> hm = new HashMap<Integer, Worker>();

		while (true) {
			System.out.println("<사원 정보 관리 프로그램>");
			System.out.println("1. 사원정보 입력");
			System.out.println("2.사원 정보 개별 조회");
			System.out.println("3.프로그램 종료");
			int select = sc.nextInt();

			switch (select) {
			case 1:
				System.out.println("사번 : ");
				int a1 = sc.nextInt();
				System.out.println("이름 : ");
				String a2 = sc.next();
				System.out.println("부서 : ");
				String a3 = sc.next();
				System.out.println("주소 : ");
				String a4 = sc.next();
				System.out.println("생일 : ");
				String a5 = sc.next();
				Worker wk = new Worker(a1, a2, a3, a4, a5);
				hm.put(a1, wk);
				System.out.println("사원 정보가 입력되었다.");

				break;
			case 2:
				System.out.println("검색하고자 하는 사원의 사번은?");
				int gum = sc.nextInt();
				if (hm.containsKey(gum)) {
					Worker w1 = hm.get(gum);
					System.out.println(w1.getN());
					System.out.println(w1.getD());
					System.out.println(w1.getAd());
					System.out.println(w1.getBir());
				} else
					System.out.println("없는 사번입니다.");
				break;

			case 3:
				System.out.println("프로그램 종료");
				System.exit(0);
				break;
			}
		}

	}
}
