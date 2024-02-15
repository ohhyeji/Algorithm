class Solution {
    public String solution(String my_string, int s, int e) {
        String answer = "";
        
        for(int i=0; i<s; i++){
            answer += String.valueOf(my_string.charAt(i));
        }
        
        String str = my_string.substring(s,e+1);
        
        for(int i=str.length()-1; i>=0; i--){
            answer += String.valueOf(str.charAt(i));
        }
        
        for(int i=e+1; i<my_string.length(); i++){
            answer += String.valueOf(my_string.charAt(i));
        }
        
        return answer;
    }
}