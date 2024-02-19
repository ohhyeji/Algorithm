class Solution {
    public int solution(int[][] sizes) {
        int answer = 0;
        int wmax = Integer.MIN_VALUE;
        int hmax = Integer.MIN_VALUE;
        
        for(int i=0; i<sizes.length; i++){
            int w = Math.max(sizes[i][0], sizes[i][1]);
            int h = Math.min(sizes[i][0], sizes[i][1]);
            
            wmax = Math.max(wmax, w);
            hmax = Math.max(hmax, h);
        }
        
        answer = wmax * hmax;
        
        return answer;
    }
}