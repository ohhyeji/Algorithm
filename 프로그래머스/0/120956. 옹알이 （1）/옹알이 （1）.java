class Solution {
    public int solution(String[] babbling) {
        int answer = 0;
        String[] arr = {"aya", "ye", "woo", "ma"};
        
        for(int i=0; i<babbling.length; i++){
            String str = "";
            
            for(int j=0; j<babbling[i].length(); j++){
                str += String.valueOf(babbling[i].charAt(j));
                
                for(int k=0; k<4; k++){
                    if(str.equals(arr[k])){
                        str = "";
                    }
                }
            }
            if(str.equals("")){
                answer++;
            }
            
        }
        
        
        return answer;
    }
}