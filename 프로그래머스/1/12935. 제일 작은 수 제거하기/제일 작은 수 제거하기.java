class Solution {
    public int[] solution(int[] arr) {
        int[] answer = new int [arr.length-1];
        int min = Integer.MAX_VALUE;
        
        for(int i=0; i<arr.length; i++){
            if(min > arr[i]){
                min = arr[i];
            }
        }
        
        int index = 0;
        for(int i=0; i<arr.length; i++){
            if(arr[i] == min){
                continue;
            }else{
                answer[index++] = arr[i];
            }
        }
        
        
        if(answer.length==0){
            answer = new int[1];
            answer[0] = -1;
        }
        
        return answer;
    }
}