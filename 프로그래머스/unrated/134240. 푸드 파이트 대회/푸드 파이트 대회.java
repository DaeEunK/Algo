class Solution {
    public String solution(int[] food) {
        String answer = "";
        int sum = 1;
        for(int i = 1; i < food.length; i++){
            if(food[i] % 2 == 0) sum += food[i];
            else sum += food[i] - 1;
        }
        
        if(sum < 3) return answer; 
        for(int i = 1; i < food.length; i++){
            for(int j = 0; j < food[i]/2; j++){
                answer += i + "";
            }
        }
        answer += 0 + "";
        for(int i = food.length-1; i >0; i--){
            for(int j = 0; j < food[i]/2; j++){
                answer += i + "";
            }
        }
        
        return answer;
    }
}