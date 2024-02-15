class Solution {
    public int solution(int num, int k) {
        int answer = -1;
        String snum = Integer.toString(num);
        String s = Integer.toString(k);
        
        if(snum.contains(s)){
            for(int i=0; i<snum.length(); i++){
                String index = String.valueOf(snum.charAt(i));
                
                if(index.equals(s)){
                    answer = i+1;
                    break;
                }
            }
        }
        
        
        return answer;
    }
}