import java.util.*;

class Solution {
    public int solution(int[] nums) {
        int answer = 0;
        Map<Integer, Integer> map = new HashMap<>();
        for(int i : nums){
            map.put(i, 1);
        }
        int n = nums.length/2;
        System.out.println(map.size());
        if(n <= map.size()) answer = n;
        else answer = map.size();
        return answer;
    }
}