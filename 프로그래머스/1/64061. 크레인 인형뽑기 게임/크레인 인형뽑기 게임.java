import java.util.*;

class Solution {
    public int solution(int[][] board, int[] moves) {
        int answer = 0;
        
        Stack<Integer> stack = new Stack<>();
       
        for(int mv:moves){
            mv -= 1;
            
            for(int i=0; i<board[0].length; i++){
                if(board[i][mv] != 0){
                    if(stack.size() > 0 && stack.peek() == board[i][mv]){
                        stack.pop();
                        answer += 2;
                    }else{
                        stack.push(board[i][mv]);
                    }
                    
                    board[i][mv] = 0;
                    break;
                }
            }
        }
        
        
        return answer;
    }
}