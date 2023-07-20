import java.util.*;

class Solution {
    public int[] solution(int k, int[] score) {
        
        int[] answer = new int[score.length];
        // 점수를 오름차순으로 나열할 ArrayList 생성
        ArrayList<Integer> rank = new ArrayList<Integer>();
        for(int i=0;i<score.length;i++){
            rank.add(score[i]);
            // ArrayList 오름차순 정렬
            Collections.sort(rank);
            // i가 k와 같아지는 지점부터 ArrayList에서 가장 작은 점수 삭제 (순위에서 밀려나므로) 
            if(i>=k) rank.remove(0);
            // answer에 ArrayList의 가장 작은 점수 담기
            answer[i] = rank.get(0);
        }
        return answer;
    
    }
}