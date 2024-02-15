class Solution {
    public int[][] solution(int[] num_list, int n) {
        int[][] answer = new int[num_list.length/n][n];
        
        int index = 0;
        for(int j=0; j<answer.length; j++){
            for(int k=0; k<n; k++){
                answer[j][k] = num_list[index++];
            }
        }
        
        
        return answer;
    }
}