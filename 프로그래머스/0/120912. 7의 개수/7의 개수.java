class Solution {
    public int solution(int[] array) {
        int answer = 0;
        
        for(int i=0; i<array.length; i++){
            String s = Integer.toString(array[i]);
            for(int j=0; j<s.length(); j++){
                if(s.substring(j,j+1).equals("7")){
                    answer++;
                }    
            }
        }
        
        return answer;
    }
}