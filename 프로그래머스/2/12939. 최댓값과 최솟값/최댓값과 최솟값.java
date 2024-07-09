class Solution {
    public String solution(String s) {
        String answer = "";
        String[] tmp = s.split(" ");
        int tmpMax = Integer.parseInt(tmp[0]);
        int tmpMin = Integer.parseInt(tmp[0]);
        for(int i = 1; i < tmp.length; i++){
            //System.out.println(tmp[i]);
            if(tmpMax < Integer.parseInt(tmp[i])) tmpMax = Integer.parseInt(tmp[i]);
            if(tmpMin > Integer.parseInt(tmp[i])) tmpMin = Integer.parseInt(tmp[i]);
        }
        return tmpMin + " " + tmpMax;
    }
}