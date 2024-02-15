class Solution {
    public int solution(String before, String after) {
        int answer = 1;
        boolean [] check1 = new boolean[before.length()];
        boolean [] check2 = new boolean[after.length()];
        
        for(int i=0; i<before.length(); i++){
            String b = String.valueOf(before.charAt(i));
            
            for(int j=0; j<after.length(); j++){
                String a = String.valueOf(after.charAt(j));
                
                if(b.equals(a) && !check2[j]){
                    check1[i] = true;
                    check2[j] = true;
                    break;
                }
            }  
        }
        
        for(int i=0; i<check1.length; i++){
            if(!check1[i]){
                answer = 0;
                break;
            }
        }
        
        return answer;
    }
}