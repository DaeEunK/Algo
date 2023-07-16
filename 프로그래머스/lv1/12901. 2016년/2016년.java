import java.util.*;

class Solution {
    public String solution(int a, int b) {
        String answer = "";
        String[] day = {"SUN", "MON", "TUE", "WED", "THU", "FRI", "SAT"};
        int sum = 4;
        for(int i = 1; i < a; i++){
            if(i == 2){
                sum += 29;
            }else if(i == 6 || i == 4 || i == 9 || i == 11) sum += 30;
            else sum+= 31;
        }
        sum += b;
        answer = day[sum % 7];
        System.out.println(sum);
        
        return answer;
    }
}