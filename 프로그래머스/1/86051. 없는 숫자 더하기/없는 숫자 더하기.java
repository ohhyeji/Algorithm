class Solution {
    public int solution(int[] numbers) {
        int answer = 0;
        int [] numArr = new int[10];
        
        for(int i=0; i<10; i++){
            numArr[i] = i;
        }
        
        for(int i=0; i<numbers.length; i++){
            for(int j=0; j<10; j++){
                if(numbers[i] == numArr[j]){
                    numArr[j] = 0;
                }
            }
        }
        
        for(int i=0; i<10; i++){
            if(numArr[i] != 0){
                answer += numArr[i];
            }
        }
        
        return answer;
    }
}