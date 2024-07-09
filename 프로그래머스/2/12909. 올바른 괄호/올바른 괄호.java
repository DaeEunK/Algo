import java.util.*;
    
class Solution {
    boolean solution(String s) {
        boolean answer = true;
        ArrayList<Character> list = new ArrayList<Character>();
        
        for(int i = 0; i < s.length(); i++){
            char tmp = s.charAt(i);
            if(tmp == '('){
                list.add(tmp);
            }
            else if(tmp == ')'&& list.size() > 0){
                list.remove(list.size()-1);
            }
            else answer = false;
            // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
            // System.out.println(list);
        }
        if(list.size() > 0) answer = false;
        return answer;
    }
}