package programmers.연습문제;

public class 콜라츠_추측 {
	public int solution(int num) {
		int answer = 0, i = 0;
		long longNum = (long) num;
		if(num == 1) return answer;

		while(i < 500){
			if(longNum == 1) {
				answer = i;
				break;
			}
			if(longNum % 2 == 0) longNum = longNum / 2;
			else if(longNum % 2 == 1) longNum = longNum * 3 + 1;

			i++;
		}
		if(answer == 0) return -1;
		return answer;
	}
}
