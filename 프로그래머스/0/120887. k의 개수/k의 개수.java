class Solution {
    public int solution(int i, int j, int k) {
        int answer = 0;
        
        for(int x=i; x<=j; x++){
            String s = Integer.toString(x);
            
            for(int y=0; y<s.length(); y++){
                if(Integer.toString(k).equals(s.substring(y, y+1))){
                    answer++;
                }
            }
        }
        return answer;
    }
}