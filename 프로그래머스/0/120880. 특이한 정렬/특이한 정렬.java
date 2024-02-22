import java.util.*;
class Solution {
    public int[] solution(int[] numlist, int n) {
        int[] answer = new int[numlist.length];
        double [] c = new double[numlist.length];
        
        for(int i=0; i<numlist.length; i++){
            if(numlist[i] - n < 0){
                c[i] = Math.abs(numlist[i] - n) + 0.5;
            }else{
                c[i] = numlist[i] - n;
            }
        }
        
        Arrays.sort(c);
        
        for(int i=0; i<c.length; i++){
            if(c[i] % 1 != 0){
                answer[i] = n - (int) c[i]; 
            }else{
                answer[i] = (int)c[i] + n;
            }
        }
        
        return answer;
    }
}