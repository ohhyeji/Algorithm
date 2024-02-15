class Solution {
    public int solution(int n) {
        int answer = 0;
            
        int num = (int) Math.sqrt(n);
        
        for(int i=1; i<=num; i++){
            if(i*i == n){
                answer = 1;
            }else{
                answer = 2;
            }
        }
        
        return answer;
    }
}