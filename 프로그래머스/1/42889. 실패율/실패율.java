class Solution {
    public int[] solution(int N, int[] stages) {
        int[] answer = new int[N];
        double[] fail = new double[N];
        int[] cnt = new int[N];
        
        for(int s:stages){
            if(s != N+1) cnt[s-1] += 1;
        }
        
        int player = stages.length;
        for(int i=0; i<N; i++){
            fail[i] = (double)cnt[i]/player;
            player -= cnt[i];
            answer[i] = i+1;
        }
        
        double dtemp = 0;
        int itemp = 0;
        for(int i=0; i<N; i++){
            for(int j=1; j<N-i; j++){
                if(fail[j-1] < fail[j]){
                    dtemp = fail[j-1];
                    fail[j-1] = fail[j];
                    fail[j] = dtemp;
                    
                    itemp = answer[j-1];
                    answer[j-1] = answer[j];
                    answer[j] = itemp;
                }
            }
        }
        
        return answer;
    }
}