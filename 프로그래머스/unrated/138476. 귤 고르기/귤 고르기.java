import java.util.*;

class Solution {
    public int solution(int k, int[] tangerine) {
        int answer = 0;
        Arrays.sort(tangerine);
        // System.out.println(Arrays.toString(tangerine));
        ArrayList<Integer> list = new ArrayList<>();
        int tmp = tangerine[0];
        int count = 1;
        for(int i = 1; i < tangerine.length; i++){
            if(tmp != tangerine[i]) {
                list.add(count);
                count = 1;
            }
            else {
                count++;
            }
            tmp = tangerine[i];
        }
        list.add(count);
        Collections.sort(list, Collections.reverseOrder());
        
        for(int i = 0; i < list.size(); i++){
            k -= list.get(i);
            answer++;
            if(k <= 0) break; 
        }
        
        // System.out.println(list);
        
        return answer;
    }
}