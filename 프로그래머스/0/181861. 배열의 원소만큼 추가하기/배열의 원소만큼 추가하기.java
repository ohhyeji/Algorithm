class Solution {
    public int[] solution(int[] arr) {
        int cnt = 0;
        for(int i=0; i<arr.length; i++){
            cnt+= arr[i];
        }
        
        int[] answer = new int [cnt];
        
        int index = 0;
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr[i]; j++){
                answer[index++] = arr[i];
            }
        }
        
        return answer;
    }
}