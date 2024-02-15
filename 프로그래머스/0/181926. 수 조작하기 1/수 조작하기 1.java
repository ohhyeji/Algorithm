class Solution {
    public int solution(int n, String control) {
        int answer = n;
        
        for(int i=0; i<control.length(); i++){
            char c = control.charAt(i);
            String str = String.valueOf(c);
            
            if("w".equals(str)){
                answer++;
            }else if("s".equals(str)){
                answer--;
            }else if("d".equals(str)){
                answer = answer + 10;
            }else if("a".equals(str)){
                answer = answer - 10;
            }
        }
        
        return answer;
    }
}