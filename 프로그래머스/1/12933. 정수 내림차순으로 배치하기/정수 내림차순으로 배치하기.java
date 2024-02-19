import java.util.*;
class Solution {
    public long solution(long n) {
        long answer = 0;
        
        String str = String.valueOf(n);
        String[] strArr = new String[str.length()];
        for(int i=0; i<str.length(); i++){
            strArr[i] = String.valueOf(str.charAt(i));
        }
        
        Arrays.sort(strArr);
        
        String result = "";
        for(int i=strArr.length-1; i>=0; i--){
            result += strArr[i];
        }
        
        answer = Long.parseLong(result);
        
        return answer;
    }
}