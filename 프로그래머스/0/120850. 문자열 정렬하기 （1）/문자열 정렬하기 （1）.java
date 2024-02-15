class Solution {
    public int[] solution(String my_string) {
        my_string = my_string.replaceAll("[a-z]", "");
        String[] str = my_string.split("");
        
        int[] answer = new int[str.length];
        
        for(int i=0; i<answer.length; i++){
            answer[i] = Integer.parseInt(str[i]);
        }
        
        for(int i=0; i<answer.length-1; i++){
            for(int j=i; j<answer.length; j++){
                if(answer[i] > answer[j]){
                    int temp = answer[i];
                    answer[i] = answer[j];
                    answer[j] = temp;
                }
            }
        }
        
        return answer;
    }
}