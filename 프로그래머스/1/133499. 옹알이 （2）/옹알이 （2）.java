import java.util.*;
class Solution {
    public int solution(String[] babbling) {
        int answer = 0;
        String[] s = {"aya", "ye", "woo", "ma"};
        String[] sss = {"ayaaya", "yeye", "woowoo", "mama"};
        
        for(int i=0; i<babbling.length; i++){
            for(int j=0; j<s.length; j++){
                babbling[i] = babbling[i].replaceAll(sss[j], "1").replaceAll(s[j], " ");         
            }
            if(babbling[i].trim().length() == 0){
                answer++;
            }
        }
        
        return answer;
    }
}