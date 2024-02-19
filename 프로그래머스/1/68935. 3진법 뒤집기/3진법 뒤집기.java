class Solution {
    public int solution(int n) {
        int answer = 0;
        
        String three = Integer.toString(n, 3);
        String threeArr = "";
        
        for(int i=three.length()-1; i>=0; i--){
            threeArr += String.valueOf(three.charAt(i));
        }
        
        answer = Integer.parseInt(threeArr, 3);
        
        return answer;
    }
}