class Solution {
    public int solution(String t, String p) {
        int answer = 0;
        long num = 0;
        long pnum = Long.parseLong(p);
        
        for(int i=0; i<=t.length()-p.length(); i++){
            num = Long.parseLong(t.substring(i, p.length()+i));
            
            if(num <= pnum){
                answer++;
            }
        }
        
        return answer;
    }
}