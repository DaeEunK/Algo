package programmers.연습문제;

import java.util.Arrays;

public class 없는_숫자_더하기 {
	public int solution(int[] numbers) {
		int answer = 0;
		boolean[] check = new boolean[10];
		for(int i: numbers) check[i] = true;
		for(int i = 0; i < 10; i++){
			if(!check[i]) answer += i;
		}

		System.out.println(Arrays.toString(check));

		return answer;
	}
}
