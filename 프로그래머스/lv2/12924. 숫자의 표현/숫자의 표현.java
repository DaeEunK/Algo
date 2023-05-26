class Solution {
    public int solution(int n) {
        int answer = 0;
        int sum = 0, cnt = 1; 
        for(int i = 1; i <= n; i++){
            sum += i;
            if(sum == n) {
                answer++;
                i = cnt++;
                sum = 0;
            }
            else if(sum > n) {
                i = cnt++;
                sum = 0;
            }
        }
        
        return answer;
    }
}