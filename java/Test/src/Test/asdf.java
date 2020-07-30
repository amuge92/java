package Test;

import java.util.HashMap;

class Solution {
	HashMap<String, String> hm = new HashMap<String, String>();

	public int solution(String[][] clothes) {
		for (int i = 0; i < clothes.length; i++) {
			hm.put(clothes[1][i], clothes[0][i]);
		}
		int answer = 0;
		return answer;
	}
}