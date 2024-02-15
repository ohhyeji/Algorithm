import java.util.*;

class Solution {
    public int solution(String s) {
        int answer = 0;
        String[] arr = s.split(" ");
        Stack<Integer> stack = new Stack<>();
        
        for(int i=0; i<arr.length; i++){
            if(!arr[i].equals("Z")){
                stack.add(Integer.parseInt(arr[i]));
            }else{
                stack.pop();
            }
        }
        
        for(int num : stack){
            answer += num;
        }
        
        
        return answer;
    }
}