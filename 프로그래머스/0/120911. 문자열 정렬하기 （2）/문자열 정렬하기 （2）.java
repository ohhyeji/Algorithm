import java.util.*;

class Solution {
    public String solution(String my_string) {
        String answer = "";
        String str = my_string.toLowerCase();
        String [] strArr = new String[str.length()];
        
        for(int i=0; i<str.length(); i++){
            char c1 = str.charAt(i);
            strArr[i] = String.valueOf(c1);
        }
        
        Arrays.sort(strArr);
        
        for(int i=0; i<strArr.length; i++){
            answer += strArr[i];
        }
        
        return answer;
    }
}