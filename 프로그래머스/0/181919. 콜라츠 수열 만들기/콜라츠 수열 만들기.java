class Solution {
    public int[] solution(int n) {
        int cnt = 0;
        int num = n;
        while(n!=1){
            if(n%2==0){
                n=n/2;
                cnt++;
            }else{
                n=3*n+1;
                cnt++;
            }
        }
        
        cnt = cnt+1;
        
        int[] answer = new int [cnt];
       
        answer[0] = num;
        
        int index = 1;
        while(num!=1){
            if(num%2==0){
                num=num/2;
                answer[index++] = num;
            }else{
                num=3*num+1;
                answer[index++] = num;
            }
        }
        
        return answer;
    }
}