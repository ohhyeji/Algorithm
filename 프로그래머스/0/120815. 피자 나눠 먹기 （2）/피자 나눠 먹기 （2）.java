class Solution {
    public int solution(int n) {
        int answer = 0;
        int num = n;
        
        for(int i=1; i<=6*n; i++){
           if(i * 6 % n == 0){
               answer = i;
               break;
           }
        }
        
        return answer;
    }
}