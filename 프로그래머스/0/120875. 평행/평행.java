class Solution {
    public int solution(int[][] dots) {
        int answer = 0;
        
        double a = (double) Math.abs(dots[0][1] - dots[1][1]) / Math.abs(dots[0][0] - dots[1][0]);
        double b = (double) Math.abs(dots[2][1] - dots[3][1]) / Math.abs(dots[2][0] - dots[3][0]);
        
        if(a-b == 0){
            answer = 1;
        }
        
        double c = (double) Math.abs(dots[0][1] - dots[2][1]) / Math.abs(dots[0][0] - dots[2][0]);
        double d = (double) Math.abs(dots[1][1] - dots[3][1]) / Math.abs(dots[1][0] - dots[3][0]);
        
        if(c-d == 0){
            answer = 1;
        }
        
        double e = (double) Math.abs(dots[0][1] - dots[3][1]) / Math.abs(dots[0][0] - dots[3][0]);
        double f = (double) Math.abs(dots[1][1] - dots[2][1]) / Math.abs(dots[1][0] - dots[2][0]);
        
        if(e-f == 0){
            answer = 1;
        }
        
        return answer;
    }
}