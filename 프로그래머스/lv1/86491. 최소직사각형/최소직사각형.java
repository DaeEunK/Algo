import java.util.*;
class Solution {
    public int solution(int[][] sizes) {
        int answer = 0;
        int maxX = 0, maxY = 0;
        for(int[] i : sizes){
            Arrays.sort(i);
            maxX = Math.max(maxX, i[0]);
            maxY = Math.max(maxY, i[1]);
        }
        
        return maxX * maxY;
    }
}