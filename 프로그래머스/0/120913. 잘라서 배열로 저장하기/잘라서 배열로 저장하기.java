class Solution {
    public String[] solution(String my_str, int n) {
        String[] answer;
        
        if(my_str.length()%n == 0){
            answer = new String[my_str.length()/n];
        }else{
            answer = new String[my_str.length()/n + 1];
        }
        
        int index = 0;
        for(int i=0; i<my_str.length(); i=i+n){
            if(i+n > my_str.length()){
                answer[index++] = my_str.substring(i);    
            }else{
                answer[index++] = my_str.substring(i, i+n);
            }    
        }
        
        return answer;
    }
}