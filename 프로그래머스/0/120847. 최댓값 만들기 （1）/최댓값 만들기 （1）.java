class Solution {
    public int solution(int[] numbers) {
        int answer = 0;
        
        for(int i=0; i<numbers.length-1; i++){
            for(int j=i+1; j<numbers.length; j++){
                if(numbers[i]<numbers[j]){
                    int temp = numbers[i];
                    numbers[i] = numbers[j];
                    numbers[j] = temp;
                }
            }
        }
        
        answer = numbers[0] * numbers[1];
        

        
        return answer;
    }
}