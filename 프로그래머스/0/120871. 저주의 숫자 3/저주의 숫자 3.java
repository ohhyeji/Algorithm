class Solution {
    public int solution(int n) {
        int [] num = new int[200];
        
        int index = 1;
        for(int i=1; i<=num.length; i++){
            if(i%3 == 0 || i/10 == 3 || i%10 == 3 || i/10 == 13){
                continue;
            }else{
                num[index++] = i;
            }
        }
        
        int answer = num[n];
        
        return answer;
    }
}