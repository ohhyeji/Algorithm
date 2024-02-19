class Solution {
    public int solution(String s) {
        int answer = 0;
        String str = "";
        String number = "";
        
        for(int i=0; i<s.length(); i++){
            char c = s.charAt(i);
            
            if(c < '0' || c > '9'){
                number += c;
                if(number.equals("zero")){
                   str += '0';
                   number = "";
               }else if(number.equals("one")){
                   str += '1';
                   number = "";
               }else if(number.equals("two")){
                   str += '2';
                   number = "";
               }else if(number.equals("three")){
                   str += '3';
                   number = "";
               }else if(number.equals("four")){
                   str += '4';
                   number = "";
               }else if(number.equals("five")){
                   str += '5';
                   number = "";
               }else if(number.equals("six")){
                   str += '6';
                   number = "";
               }else if(number.equals("seven")){
                   str += '7';
                   number = "";
               }else if(number.equals("eight")){
                   str += '8';
                   number = "";
               }else if(number.equals("nine")){
                   str += '9';
                   number = "";
               }
            }else{
                str += c+"";
            }
            
        }
        
        answer = Integer.parseInt(str);
        
        return answer;
    }
}