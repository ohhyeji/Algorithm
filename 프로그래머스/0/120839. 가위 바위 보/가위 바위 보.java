class Solution {
    public String solution(String rsp) {
        String answer = "";
        
        for(int i=0; i<rsp.length(); i++){
            String c = String.valueOf(rsp.charAt(i));
            
            if(c.equals("2")){
                answer += "0";
            }else if(c.equals("0")){
                answer += "5";
            }else{
                answer += "2";
            }
        }
        
        
        return answer;
    }
}