class Solution {
    public String solution(String my_string, int num1, int num2) {
        String answer = "";
        
        for(int i=0; i<my_string.length(); i++){
            String s = String.valueOf(my_string.charAt(i));
            
            if(i==num1){
                answer += my_string.charAt(num2);
                continue;
            }else if(i==num2){
                answer += my_string.charAt(num1);
                continue;
            }
            answer += s;
        }
        
        return answer;
    }
}