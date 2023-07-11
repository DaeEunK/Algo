import java.util.*;

public class Solution {
    public int solution(int n) {
        int ans = 0;
        boolean check = false;
        
        while(true){
            if(n % 2 == 0) n /= 2;
            else {
                ans++;
                n--;    
            }
            
            if(n == 0) break;
        }

        return ans;
    }
}