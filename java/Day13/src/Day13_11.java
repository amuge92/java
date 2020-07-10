class Log {
	boolean login(String a, String b) {
		boolean d = true;
		if (a == "용석" && b == "123") {
			d = true;
		} else if (a != "용석" || b != "123")
			d = false;
		return d;
	}

	void logout(String a) {
		if (a == "용석")
			System.out.println("로그아웃 됨");

	}

}

public class Day13_11 {
	public static void main(String[] args) {

		Log log = new Log();
		boolean result = log.login("용석", "123");
		if (result) {
			System.out.println("로그인");
			log.logout("용석");// 로그아웃됨!
		} else {
			System.out.println("로그인 안됨!!");
		}
	}
}
