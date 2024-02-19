class Solution {
    public int solution(int[][] dots) {
        int answer = 0;
        int w = 0;
        int h = 0;
        
        for(int i=0; i<dots.length-1; i++){
            for(int j=i+1; j<dots.length; j++){
                if(dots[i][0] != dots[j][0]){
                    w = Math.max(dots[i][0], dots[j][0]) - Math.min(dots[i][0], dots[j][0]);       
                }    
                if(dots[i][1] != dots[j][1]){
                    h = Math.max(dots[i][1], dots[j][1]) - Math.min(dots[i][1], dots[j][1]);    
                }
            }
        }
            
        answer = w * h;
        
        return answer;
    }
}