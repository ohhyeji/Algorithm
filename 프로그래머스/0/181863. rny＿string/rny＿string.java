class Solution {
    public String solution(String rny_string) {
        String answer = rny_string;
        
        for(int i=0; i<answer.length(); i++){
            char c = answer.charAt(i);
            String str = String.valueOf(c);
            
            if("m".equals(str)){
                answer = answer.replaceAll("m", "rn");
            }
        }
        
        return answer;
    }
}