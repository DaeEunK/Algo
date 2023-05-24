package programmers.연습문제;

public class 가운데_글자_가져오기 {
	public String solution(String s) {
		StringBuilder answer = new StringBuilder();
		if(s.length() % 2 == 0) {
			answer.append(s.charAt(s.length() / 2 - 1)).append(s.charAt(s.length() / 2));
		}
		else answer.append(s.charAt(s.length() / 2));

		return answer.toString();
	}
}
