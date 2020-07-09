class car{
	String color = "»¡°­";
	int speed = 100;

	void upspeed(int s) {
		speed = speed + s;
	}

	void downspeed(int s) {
		speed = speed - s;
	}
}

public class Day6_1 {
	public static void main(String[] args) {
		car c1 = new car();
		c1.speed=120;
		c1.upspeed(30);
        System.out.println(c1.color + c1.speed);
	}
}
