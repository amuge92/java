package Test;

import java.util.Scanner;

public class b079 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		int x = s.nextInt();
		int p = s.nextInt();

		int b = x;
		int d = 0;
		while (true) {
			b = b * (100 - p) / 100;

			x = x + b;

			if (b == 0) {
				break;
			}
		}
		System.out.println(x);
	}
}

class Solution {
	String str;

	public String solution(String[] participant, String[] completion) {
		String answer = "";
		int aa[] = new int[participant.length];
		for (int i = 0; i < aa.length; i++) {
			aa[i] = 0;
		}
		for (int i = 0; i < participant.length; i++) {
			for (int j = 0; j < completion.length; j++) {
				if (participant[i].equals(completion[j])) {
					aa[i]++;
				}
				if(participant[i].equals(participant[i+1]))
					return = participant[i];
			}
			if (aa[i] == 0) {
				answer = participant[i];
			}
		}
		return answer;

	}
}
