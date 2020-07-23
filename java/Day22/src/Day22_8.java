import java.util.Scanner;
import java.util.StringTokenizer;



public class Day22_8 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		// 문자열을 입력해서 한 라인으로 읽어 공백으로 분리된 수가 몇개인지 출력
		String str = "동해물과 백두산이 마르고 닳도록 하느님이 보우하사";
		StringTokenizer st = new StringTokenizer(str," ");
		String []str2 = str.split(" ");
		System.out.println(st.countTokens());
		System.out.println(str2.length);
		
		
	}
}
