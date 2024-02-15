class Solution {
    public String[] solution(String[] strArr) {
        int cnt = 0;
        for(int i=0; i<strArr.length; i++){
            if(strArr[i].contains("ad")){
                strArr[i] = "";
                cnt++;
            }
        }
        
        int index = 0;
        
        String[] answer = new String[strArr.length-cnt];
        for(int i=0; i<strArr.length; i++){
            if(strArr[i].equals("")){
                continue;
            }
            answer[index++] = strArr[i]; 
        }
        return answer;
    }
}