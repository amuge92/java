import java.util.StringTokenizer;

public class Day14_6 {
	public static void main(String[] args) {
		String str = "id=231#124kdasg5%#@$!dfsadasfe1";
//#을 기준으로 문자열 나누기
		StringTokenizer s = new StringTokenizer(str, "#");
		System.out.println(s.countTokens());
//str에 있는 #을 기준으로 나눈 문자열의 갯수

		while (s.hasMoreTokens()) {
			String a = s.nextToken();
			// 토큰#을 기준으로 전부 출력
			System.out.println(a);
		}
	}
}
