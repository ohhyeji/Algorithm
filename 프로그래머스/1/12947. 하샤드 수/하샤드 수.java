class Solution {
    public boolean solution(int x) {
        boolean answer = true;
        
        int num = 0;
        int xx = x;
        while(x != 0){
            num += x%10;
            x = x/10;
        }
        
        if(xx%num == 0){
            answer = true;
        }else{
            answer = false;
        }
        
        return answer;
    }
}