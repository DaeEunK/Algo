class Solution {
    public int solution(int n) {
        long[] fibo = new long[n+2];
        fibo[1] = 1L;
        fibo[2] = 1L;
        for(int i = 3; i <= n; i++){
            fibo[i] = (fibo[i-1] + fibo[i-2]) % 1234567;
        }
        
        return (int) fibo[n];
    }
}