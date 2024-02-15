class Solution {
    public String solution(String s) {
        String answer = "";
        int [] strArr = new int[26];
        
        for(int i=0; i<s.length(); i++){
            char c = s.charAt(i);
            
            strArr[c-'a'] += 1;
        }
        
        for(int i=0; i<strArr.length; i++){
            if(strArr[i] == 1){
                answer += (char) (i+'a');
            }else{
                continue;
            }
        }
        
        return answer;
    }
}