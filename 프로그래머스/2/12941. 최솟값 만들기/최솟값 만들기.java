import java.util.*;

class Solution
{
    public int solution(int []A, int []B)
    {
        int answer = 0;
        ArrayList<Integer> listA = new ArrayList<>();
        ArrayList<Integer> listB = new ArrayList<>();
        for(int i = 0; i < A.length; i++){
            listA.add(A[i]);
            listB.add(B[i]);
        }
        
        Collections.sort(listA);
        Collections.sort(listB, Collections.reverseOrder());
        
        for(int i = 0; i < A.length; i++){
            answer += listA.get(i) * listB.get(i);
        }
        // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.

        return answer;
    }
}