import java.util.*;

class Solution {
    boolean solution(String s) {
        boolean answer = true;

        Stack<Character> stack = new Stack<>();
        for(char c : s.toCharArray()){
            if(stack.size() == 0) {
                stack.push(c);
                if(stack.peek() == ')') break;
            }
            else if(stack.peek() == '(') {
                if(c == ')') stack.pop();
                else stack.push(c);
            }
            else break;
        }
        if(stack.size() != 0) return false; 
        
        return answer;
    }
}