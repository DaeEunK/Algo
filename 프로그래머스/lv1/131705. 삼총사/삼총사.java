import java.util.*;
class Solution {
    static int answer;
    public int solution(int[] number) {
        answer = 0;
        조합(number, new int[3], 0, 3, 0);
        
        return answer;
    }
    
    void 조합(int[] arr, int[] sel, int idx, int n, int cnt){
        if(cnt == n){
            if(arr[sel[0]] + arr[sel[1]] + arr[sel[2]] == 0) answer++;
            System.out.println(Arrays.toString(sel));
            return;
        }
        
        for(int i = idx; i < arr.length; i++){
            sel[cnt] = i;
            조합(arr, sel, i+1, n, cnt+1);
        }
    }
}