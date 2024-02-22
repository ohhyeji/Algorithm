import java.util.*;
class Solution {
    public int solution(int a, int b) {
        int answer = 1;
        
        for(int i=1; i<=a; i++){
            if(a%i == 0 && b%i == 0){
                a = a/i;
                b = b/i;
            }
        }
        
        HashSet<Integer> set = new HashSet<>();
        int index = 2;
        while(b != 1){
            if(b%index == 0){
                b = b/index;
                set.add(index);
            }else{
                index++;
            }
        }
        
        int [] array = new int[set.size()];
        int list = 0;
        for(int x : set){
            array[list++] = x;
        }
        
        for(int i=0; i<array.length; i++){
            if(array[i] == 2 || array[i] == 5){
                answer = 1;
            }else{
                answer = 2;
                break;
            }
        }
        
        return answer;
    }
}