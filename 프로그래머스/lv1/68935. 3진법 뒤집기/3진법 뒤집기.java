import java.util.*;

class Solution {
    public int solution(int n) {
        int answer = n;
        String tmp = "";
        while(answer/3 > 0){
            tmp += String.valueOf(answer % 3);
            answer = answer / 3;
        }
        tmp += String.valueOf(answer % 3);
        answer = 0;
        for(int i = 0; i < tmp.length(); i++){
            answer += (tmp.charAt(tmp.length() - i - 1) - '0') * Math.pow(3, i);
            System.out.println(tmp.charAt(tmp.length() - i - 1) );
            System.out.println(Math.pow(3, i));
        }
        
        System.out.println(tmp);
        
        return answer;
    }
}