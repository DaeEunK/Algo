package programmers.연습문제;

import java.util.Arrays;

public class 정수_내림차순으로_배치하기 {
	public long solution(long n) {
		String answer = "";
		String num = String.valueOf(n);
		char[] nums = new char[num.length()];
		for(int i = 0; i < num.length(); i++){
			nums[i] = num.charAt(i);
		}
		Arrays.sort(nums);
		for(int i = 0; i < num.length(); i++){
			answer += nums[num.length() - i - 1];
		}

		return Long.parseLong(answer);
	}
}
