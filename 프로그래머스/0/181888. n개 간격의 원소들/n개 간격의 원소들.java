class Solution {
    public int[] solution(int[] num_list, int n) {
        int cnt = 0;
        for(int i=0; i<num_list.length; i++){
            if(i%n == 0){
                cnt++;
            }
        }
        
        int[] answer = new int[cnt];
        
        int index = 0;
        for(int i=0; i<num_list.length; i++){
            if(i%n==0){
                answer[index++] = num_list[i];
            } 
        }
        return answer;
    }
}