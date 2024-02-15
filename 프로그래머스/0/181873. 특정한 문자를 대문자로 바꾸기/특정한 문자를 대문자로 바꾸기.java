class Solution {
    public String solution(String my_string, String alp) {
        String answer = my_string;
        
        for(int i=0; i<answer.length(); i++){
            char c = answer.charAt(i);
            String str = String.valueOf(c);
            
            if(str.equals(alp)){
                answer = answer.replaceAll(str, alp.toUpperCase());
            }
        }
        
        return answer;
    }
}