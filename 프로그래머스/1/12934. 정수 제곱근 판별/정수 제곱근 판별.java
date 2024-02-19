class Solution {
    public long solution(long n) {
        long answer = -1;
        
        long sqrt = (long) Math.sqrt(n);
        long pow = (long) Math.pow(sqrt, 2);
        
        sqrt = sqrt + 1;
        
        if(pow == n){
            answer = (long) Math.pow(sqrt, 2);   
        }
        
        return answer;
    }
}