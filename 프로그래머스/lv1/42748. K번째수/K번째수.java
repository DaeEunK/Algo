import java.util.*;

class Solution {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];
        for(int i = 0; i < commands.length; i++){
            int[] tmp = new int[commands[i][1] - commands[i][0] + 1];
            int cnt = 0;
            for(int j = commands[i][0]-1; j < commands[i][1]; j++){
                // System.out.print(array[j] + " ");
                tmp[cnt] = array[j];
                cnt++;
            }
            Arrays.sort(tmp);
            answer[i] = tmp[commands[i][2]-1];
            // System.out.println(commands[i][1] - commands[i][0] + 1);
        }
        
        return answer;
    }
}