package programmers.연습문제;

import java.util.ArrayList;

public class 제일_작은_수_제거하기 {
	public int[] solution(int[] arr) {
		int[] answer = new int[arr.length - 1];
		int[] answerTmp = {-1};
		if(answer.length == 0) return answerTmp;
		ArrayList<Integer> list = new ArrayList<>();

		int min = Integer.MAX_VALUE;
		for(int i = 0; i < arr.length; i++){
			min = Math.min(min, arr[i]);
		}
		for(int i: arr){
			if(i != min) list.add(i);
		}

		for(int i = 0; i < list.size(); i++) answer[i] = list.get(i);

		return answer;
	}
}
