class Solution {
    public int[] solution(int numer1, int denom1, int numer2, int denom2) {
        int[] answer = new int[2];
        answer[0] = numer1 * denom2 + numer2 * denom1;
        answer[1] = denom2 * denom1;
        // 최대공약수 구하기
        int gcd = gcd(answer[0], answer[1]);

        answer[0] /= gcd;
        answer[1] /= gcd;
        return answer;
    }
    
    public int gcd(int a, int b){
        if(b == 0) return a;
        
        return gcd(b, a%b);
    }
}