class Solution {
    public int[] solution(int[] array) {
        int[] answer = new int[2];
        
        for(int i=1; i<array.length; i++){
            if(array[i-1] < array[i]){
                answer[0] = array[i];
                answer[1] = i;
            }
        }
        return answer;
    }
}