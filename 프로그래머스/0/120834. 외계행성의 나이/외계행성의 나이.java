class Solution {
    public String solution(int age) {
        String answer = "";
        String s = Integer.toString(age);
        
        for(int i=0; i<s.length(); i++){
            char c = s.charAt(i);
            String str = String.valueOf(c);
            
            answer += (char) (Integer.parseInt(str)+97);
        }
        
        return answer;
    }
}