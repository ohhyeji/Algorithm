class Solution {
    public int solution(int[] array) {
        int answer = 0;
        int[] num = new int[1000];
        
        for(int i=0; i<array.length; i++){
            num[array[i]]++;
        }
        
        int max = 0;
        for(int i=0; i<num.length; i++){
            if(max < num[i]){
                max = num[i];
                answer = i;
            }else if(max == num[i]){
                answer = -1;
            }
        }
        
        return answer;
    }
}