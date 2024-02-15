class Solution {
    public String[] solution(String[] names) {
        int cnt = 0;
        int count = 0;
        for(int i=0; i<names.length; i++){
            if(i%5==0){
                count++;
            }
        }
        
        String[] answer = new String[count];
        
        for(int i=0; i<names.length; i++){
            if(i%5==0){
                answer[cnt++] = names[i];
            }
        }
        return answer;
    }
}