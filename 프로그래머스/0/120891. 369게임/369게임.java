class Solution {
    public int solution(int order) {
        int answer = 0;
        
        String str = Integer.toString(order);
        for(int i=0; i<str.length(); i++){
            String s = String.valueOf(str.charAt(i));
            
            if(s.equals("3") || s.equals("6") || s.equals("9")){
                answer++;
            }
        }
        
        return answer;
    }
}