import java.util.*;
class Solution {
    public int solution(int[][] board) {
        ArrayList<int[]> list = new ArrayList<>();
        int answer = 0;
        int[] dx = {0,1,-1,0,-1,1,1,-1};
        int[] dy = {1,0,0,-1,-1,1,-1,1};
        
        for(int i=0; i<board.length; i++){
            for(int j=0; j<board[0].length; j++){
                if(board[i][j] == 1){
                    int[] temp = {i, j};
                    list.add(temp);
                }
            }
        }
        
        for(int a=0; a<list.size(); a++){
            int i = list.get(a)[0];
            int j = list.get(a)[1];
            
            for(int b=0; b<8; b++){
                if(dx[b]+i >= 0 && dy[b]+j >= 0 && dx[b]+i <= board.length-1 && dy[b]+j <= board[0].length-1){
                    board[dx[b]+i][dy[b]+j] = 1;
                }    
            }
        }
        
        for(int i=0; i<board.length; i++){
            for(int j=0; j<board[i].length; j++){
                if(board[i][j] != 1){
                    answer++;
                }
            }
        }
        
        return answer;
    }
}