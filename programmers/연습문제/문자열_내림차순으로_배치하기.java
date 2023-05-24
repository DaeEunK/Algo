package programmers.연습문제;

import java.util.Arrays;
import java.util.Collections;

public class 문자열_내림차순으로_배치하기 {
	public String solution(String s) {
		String[] answer = s.split("");
		Arrays.sort(answer, Collections.reverseOrder());
		String result = String.join("", answer);

		return result;
	}
}
