import java.util.*;

class Solution {
    public int[] solution(String s) {
        int[] answer = new int[s.length()];
        int[] alpa = {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1};
        
        for(int i = 0; i < s.length(); i++){
            // answer[i] = alpa[s.charAt(i) - 96];
            // System.out.println(Arrays.toString(alpa));
            if(alpa[s.charAt(i) - 96] == -1) {
                answer[i] = alpa[s.charAt(i) - 96];
                // alpa[s.charAt(i) - 96] = i;
            }
            else {
                answer[i] = i - alpa[s.charAt(i) - 96];
                // alpa[s.charAt(i) - 96] =  i - alpa[s.charAt(i) - 96];
            }
                alpa[s.charAt(i) - 96] = i;
        }
        return answer;
    }
}