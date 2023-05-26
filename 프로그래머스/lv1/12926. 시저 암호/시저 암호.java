class Solution {
    public String solution(String s, int n) {
        String answer = "";
        for(char a : s.toCharArray()){
            if(a != ' '){
                if(a < 91) { // 대문자라면
                    if(a - 0 + n > 90) answer += (char) (a - 0 + n - 26);
                    else answer += (char) (a - 0 + n);
                }else {
                    if(a - 0 + n > 122) answer += (char) (a - 0 + n - 26);
                    else answer += (char) (a - 0 + n);
                }
                
                System.out.println((char)('A'-0 + 1)); // 65
                System.out.println('Z'-0); // 90
                System.out.println('a'-0); // 97 
                System.out.println('z'-0); // 122
            }else answer += ' ';
        }
        
        return answer;
    }
}