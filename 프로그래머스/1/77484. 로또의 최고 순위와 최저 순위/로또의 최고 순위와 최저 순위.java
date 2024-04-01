import java.util.*;

class Solution {
    public int[] solution(int[] lottos, int[] win_nums) {
        int[] answer = new int[2];
        
        Arrays.sort(lottos);
        Arrays.sort(win_nums);
        
        int cnt = 0;
        int zero = 0;
        
        for(int i=0; i<lottos.length; i++){
            for(int j=0; j<win_nums.length; j++){
                if(lottos[i] == win_nums[j]){
                    cnt++;
                    break;
                }
            }
           
            if(lottos[i] == 0){
                    zero++;
                }
        }
        
        answer[0] = 6 - (cnt + zero) + 1;
        answer[1] = 6 - cnt + 1;
        
        if(answer[0] == 7){
            answer[0] = 6;
        }
        if(answer[1] == 7){
            answer[1] = 6;
        }
        
        return answer;
    }
}