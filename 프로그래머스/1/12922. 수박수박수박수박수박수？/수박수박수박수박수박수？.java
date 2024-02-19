class Solution {
    public String solution(int n) {
        String answer = "";
        String su = "수";
        String park = "박";
        
        if(n%2 == 0){
            for(int i=0; i<n; i++){
                if(i%2 == 0){
                    answer += su;
                }else{
                    answer += park;
                }
            }
        }else{
            for(int i=0; i<n; i++){
                if(i%2 == 0){
                    answer += su;
                }else{
                    answer += park;
                }
            }
        }
        
        return answer;
    }
}