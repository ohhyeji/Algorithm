class Solution {
    public long solution(int price, int money, int count) {
        long answer = 0;
        long multi =0;
        long sum = 0;
        
        for(int i=1; i<=count; i++){
            multi = price * i;
            sum += multi;
        }
        
        if(sum > money){
            answer = sum - money;
        }else{
            answer = 0;
        }

        return answer;
    }
}