import java.util.*;

class Solution {
    public int[] solution(String s) {
        int[] answer = new int[2];
        int idx = 0, cnt = 0;
        while(true){
            if(s.length() == 1) break;
            StringBuilder tmp = new StringBuilder();
            for(char c : s.toCharArray()){
                if(c == '1') tmp.append("1");
                else cnt++;
            }
            
            String binary = Integer.toBinaryString(tmp.length());
            s = binary;
            idx++;
        }
        answer[0] = idx;
        answer[1] = cnt;
        
        return answer;
    }
}