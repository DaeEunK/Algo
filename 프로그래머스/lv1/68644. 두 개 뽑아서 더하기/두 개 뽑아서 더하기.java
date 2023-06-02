import java.util.*;

class Solution {
    public int[] solution(int[] numbers) {
        Arrays.sort(numbers);
        // System.out.println(Arrays.toString(numbers));
        Set<Integer> set = new HashSet<>();
        for(int i = 0; i < numbers.length; i++){
            for(int j = i+1; j < numbers.length; j++){
                set.add(numbers[i] + numbers[j]);
            }
        }
        Iterator<Integer> iterator = set.iterator();
        
        int[] answer = new int[set.size()];
        int i = 0;
        while(iterator.hasNext()) { // iterator에 다음 값이 있다면
            answer[i++] = iterator.next();
		}
        Arrays.sort(answer);
        
        return answer;
    }
}