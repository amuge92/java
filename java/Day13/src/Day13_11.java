class Log {
	boolean login(String a, String b) {
		boolean d = true;
		if (a == "�뼮" && b == "123") {
			d = true;
		} else if (a != "�뼮" || b != "123")
			d = false;
		return d;
	}

	void logout(String a) {
		if (a == "�뼮")
			System.out.println("�α׾ƿ� ��");

	}

}

public class Day13_11 {
	public static void main(String[] args) {

		Log log = new Log();
		boolean result = log.login("�뼮", "123");
		if (result) {
			System.out.println("�α���");
			log.logout("�뼮");// �α׾ƿ���!
		} else {
			System.out.println("�α��� �ȵ�!!");
		}
	}
}
