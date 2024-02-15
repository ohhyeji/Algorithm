class Solution {
    public int solution(String number) {
        int answer = 0;
        int total = 0;
        
        for(int i=0; i<number.length(); i++){
            String s = String.valueOf(number.charAt(i));
        
            total += Integer.parseInt(s);
        }
        
        answer = total%9;
        
        return answer;
    }
}