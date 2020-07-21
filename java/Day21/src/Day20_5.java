import java.net.InetAddress;

public class Day20_5 {
	public static void main(String[] args) {
//IP주소를 얻어내는 클래스 
		try {
			InetAddress i = InetAddress.getLocalHost();
			System.out.println(i.getHostAddress());
			InetAddress[] ary = InetAddress.getAllByName("www.naver.com");
			for(InetAddress a:ary) {
				System.out.println(a.getHostAddress());
			}
			
			
			
			
			
			
			
		} catch (Exception e) {
		}

	}
}
