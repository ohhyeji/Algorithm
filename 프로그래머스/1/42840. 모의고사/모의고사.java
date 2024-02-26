import java.util.*;
class Solution {
    public List<Integer> solution(int[] answers) {
        int[] one = {1, 2, 3, 4, 5};
        int[] two = {2, 1, 2, 3, 2, 4, 2, 5};
        int[] three = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};
        
        int[] answer = new int[3];
        
        for(int i=0; i<answers.length; i++){
            if(answers[i] == one[i%5]){
                answer[0]++;
            }if(answers[i] == two[i%8]){
                answer[1]++;
            }if(answers[i] == three[i%10]){
                answer[2]++;
            }
        }
        
        List<Integer> list = new ArrayList<>();
        int max = Math.max(answer[0], Math.max(answer[1], answer[2]));
        
        for(int i=0; i<3; i++){
            if(max == answer[i]){
                list.add(i+1);
            }
        }
        
        return list;
    }
}