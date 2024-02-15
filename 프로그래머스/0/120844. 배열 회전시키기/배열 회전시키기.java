class Solution {
    public int[] solution(int[] numbers, String direction) {
        int[] answer = new int[numbers.length];
        
        int index = 0;
        if(direction.equals("right")){
            answer[index++] = numbers[numbers.length-1];
            for(int i=0; i<numbers.length-1; i++){
                answer[index++] = numbers[i];   
            }
        }else{
            for(int i=1; i<numbers.length; i++){
                answer[index++] = numbers[i];
            }
            answer[index++] = numbers[0];
        }
        
        return answer;
    }
}