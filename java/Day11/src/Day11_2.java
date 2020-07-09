class Sports {
	String player;
	int number;

}

class Baseball extends Sports {
	int money;
}

public class Day11_2 {
	public static void main(String[] args) {
		Baseball bb = new Baseball();
		Sports st = new Sports();
		bb.money = 1000;
		bb.player = "±æµ¿";
		bb.number = 10;
		System.out.println(st.player);
		System.out.println(bb.player);

	}
}
