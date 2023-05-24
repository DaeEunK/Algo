package programmers.연습문제;

public class JadenCase_문자열_만들기 {
	public String solution(String s) {
		String[] answer = s.split("");
		boolean check = true;
		String result = "";

		for(String tmp : answer){
			if(check){
				check = false;
				tmp = tmp.toUpperCase();
			}else tmp = tmp.toLowerCase();

			if(tmp.equals(" ")) check = true;
			result += tmp;
		}

		return result;
	}
}
