import java.util.*;
    
class Solution
{
    public int solution(String s)
    {
        int answer = -1;

        Stack<Character> stack = new Stack<>();
        for(char c : s.toCharArray()){
            if(stack.size() == 0) stack.push(c);
            else{
                if(stack.peek() == c) stack.pop();
                else stack.push(c);
            }
            
        }
        if(stack.size() > 0) return 0;
        // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
        System.out.println("Hello Java");

        return 1;
    }
}