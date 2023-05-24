package programmers.연습문제;

public class 자연수_뒤집어_배열로_만들기 {
	public int[] solution(long n) {
		String num = String.valueOf(n);
		int[] answer = new int[num.length()];
		for(int i = 0; i < num.length(); i++){
			answer[i] = num.charAt(num.length() - i - 1) - '0';
		}
		return answer;
	}
}
