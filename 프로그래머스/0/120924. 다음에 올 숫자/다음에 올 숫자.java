class Solution {
    public int solution(int[] common) {
        int answer = 0;
        
        int result = common[1] - common[0];
        int result2 = 0;
        
        if(common[0] != 0){
            result2 = common[1]/common[0];
        }
                
        if(common[common.length-1] - common[common.length-2] == result){
            answer = common[common.length-1] + result;
        }else if(common[common.length-1]/common[common.length-2] == result2){
            answer = common[common.length-1] * result2;
        }
        

        
        return answer;
    }
}