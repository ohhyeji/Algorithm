class Solution {
    public String solution(String myString) {
        String answer = "";
        
        for(int i=0; i<myString.length(); i++){
            char c = myString.charAt(i);
            
            if(c-'a' < 'l'-'a'){
                answer += 'l';
                continue;
            }
            
            answer += c;
        }
        
        return answer;
    }
}