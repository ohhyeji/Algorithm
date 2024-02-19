class Solution {
    public int[] solution(String s) {
        int[] answer = new int[s.length()];
        char [] cArr = s.toCharArray();
        
        answer[0] = -1;
        
        for(int i=1; i<s.length(); i++){
            for(int j=i-1; j>=0; j--){
                if(cArr[i] != cArr[j]){
                    answer[i] = -1;
                }else{
                    answer[i] = i-j;
                    break;
                }
            }
        }
        
        return answer;
    }
}