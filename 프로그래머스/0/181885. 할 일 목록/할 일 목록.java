class Solution {
    public String[] solution(String[] todo_list, boolean[] finished) {
        int bol_length = 0;
        
        for(int i=0; i<finished.length; i++){
            if(!finished[i]){
                bol_length++;
            }
        }
        
        String[] answer = new String[bol_length];
        
        int cnt = 0;
        
        for(int i=0; i<todo_list.length; i++){
            if(!finished[i]){
                answer[cnt] = todo_list[i];
                cnt++;
            }
        }
        
        return answer;
    }
}