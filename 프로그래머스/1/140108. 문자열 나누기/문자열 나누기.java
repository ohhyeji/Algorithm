class Solution {
    public int solution(String s) {
        int answer = 0;
        char start = s.charAt(0);
        int startnum = 0;
        int diff = 0;
        
        for(int i=0; i<s.length(); i++){
            if(startnum == diff){
                answer++;
                start = s.charAt(i);
            }
            if(s.charAt(i) == start){
                startnum++;
            }else{
                diff++;
            }
        }
        
        return answer;
    }
}