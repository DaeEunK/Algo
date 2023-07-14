import java.util.*;

class Solution {
    public int solution(String s) {
        int answer = 0;
        
        Stack<Character> stack = new Stack<>();
        for(int k = 0; k < s.length(); k++){
            
            for(int i = 0; i < s.length(); i++){
                if(stack.size() == 0) {
                    stack.push(s.charAt(i));
                    continue;
                }
                if(stack.peek() == '[' && s.charAt(i) == ']') stack.pop();
                else if(stack.peek() == '{' && s.charAt(i) == '}') stack.pop();
                else if(stack.peek() == '(' && s.charAt(i) == ')') stack.pop();
                else if(s.charAt(i) == '{' || s.charAt(i) == '(' || s.charAt(i) == '[') stack.push(s.charAt(i));
                else break;
            }
            if(stack.size() == 0) answer++;
            stack.clear();
            
            char tmp = s.charAt(0);
            s = s.substring(1);
            s += tmp;
        }
        
        
        return answer;
    }
}