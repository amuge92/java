package business;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

class Profile {
	private String sa, name, buseo, add, birth;

	Profile(String sa, String name, String buseo, String add, String birth) {
this.sa = sa;
		this.name = name;
		this.buseo = buseo;
		this.add = add;
		this.birth = birth;
	}

	public String getSa() {
		return sa;
	}

	public void setSa(String sa) {
		this.sa = sa;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getBuseo() {
		return buseo;
	}

	public void setBuseo(String buseo) {
		this.buseo = buseo;
	}

	public String getAdd() {
		return add;
	}

	public void setAdd(String add) {
		this.add = add;
	}

	public String getBirth() {
		return birth;
	}

	public void setBirth(String birth) {
		this.birth = birth;
	}
}

public class main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		HashMap<String, Profile> hm = new HashMap<String, Profile>();
		System.out.println("사원 정보 관리 프로그램");
		while (true) {

			System.out.println("1. 사원정보 입력 \n2. 사원정보 개별 조회\n3. 프로그램 종료");
			String a = br.readLine();
			switch (a) {
			case "1":
				Profile pro = new Profile(null, null, null, null, null);
				System.out.println("사번 : ");
				pro.setSa(br.readLine());
				System.out.println("이름 : ");
				pro.setName(br.readLine());
				System.out.println("부서 : ");
				pro.setBuseo(br.readLine());
				System.out.println("주소 : ");
				pro.setAdd(br.readLine());
				System.out.println("생일 : ");
				pro.setBirth(br.readLine());
				hm.put(pro.getSa(), pro);
				System.out.println("사원정보가 입력되었다.");
				break;

			case "2":
				System.out.println("검색하고자 하는 사원의 사번은?");
				String a1 = br.readLine();
				Profile pro1 = hm.get(a1);
				System.out.println("이름 : " + pro1.getName());
				System.out.println("부서 : " + pro1.getBuseo());
				System.out.println("주소 : " + pro1.getAdd());
				System.out.println("생일 : " + pro1.getBirth());
				break;

			case "3":
				System.out.println("프로그램 종료");
				System.exit(0);
				break;

			}

		}

	}
}
