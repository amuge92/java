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
			System.out.println("<��� ���� ���� ���α׷�>");
			System.out.println("1. ������� �Է�");
			System.out.println("2.��� ���� ���� ��ȸ");
			System.out.println("3.���α׷� ����");
			int select = sc.nextInt();

			switch (select) {
			case 1:
				System.out.println("��� : ");
				int a1 = sc.nextInt();
				System.out.println("�̸� : ");
				String a2 = sc.next();
				System.out.println("�μ� : ");
				String a3 = sc.next();
				System.out.println("�ּ� : ");
				String a4 = sc.next();
				System.out.println("���� : ");
				String a5 = sc.next();
				Worker wk = new Worker(a1, a2, a3, a4, a5);
				hm.put(a1, wk);
				System.out.println("��� ������ �ԷµǾ���.");

				break;
			case 2:
				System.out.println("�˻��ϰ��� �ϴ� ����� �����?");
				int gum = sc.nextInt();
				if (hm.containsKey(gum)) {
					Worker w1 = hm.get(gum);
					System.out.println(w1.getN());
					System.out.println(w1.getD());
					System.out.println(w1.getAd());
					System.out.println(w1.getBir());
				} else
					System.out.println("���� ����Դϴ�.");
				break;

			case 3:
				System.out.println("���α׷� ����");
				System.exit(0);
				break;
			}
		}

	}
}
