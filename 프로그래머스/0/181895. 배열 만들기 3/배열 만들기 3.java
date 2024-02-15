class Solution {
    public int[] solution(int[] arr, int[][] intervals) {
        int cnt = (intervals[0][1] - intervals[0][0] + 1) + (intervals[1][1] - intervals[1][0] + 1);
        
        int[] answer = new int[cnt];
        
        int index = 0;
        for(int i=intervals[0][0]; i<arr.length; i++){
            if(i==intervals[0][1]+1){
                break;
            }
            answer[index++] = arr[intervals[0][0]++];
        }
        
        for(int i=intervals[1][0]; i<arr.length; i++){
            if(i==intervals[1][1]+1){
                break;
            }
            answer[index++] = arr[intervals[1][0]++];
        }
        
        return answer;
    }
}