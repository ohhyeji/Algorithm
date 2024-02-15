class Solution {
    public int solution(int n) {
        int answer = 0;
        int multi = 1;
        
        for(int i=1; i<=10; i++){
            multi *= i;
            
            if(n == multi){
                answer = i;
                break;
            }else if(n < multi){
                answer = i-1;
                break;
            }
        }
        
        return answer;
    }
}