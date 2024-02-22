class Solution {
    public String[] solution(String[] quiz) {
        String[] answer = new String[quiz.length];
 
        int index = 0;
        for(int i=0; i<quiz.length; i++){
            String[] arr = quiz[i].split(" ");
                int result = Integer.parseInt(arr[0]);
                String s = "";
            
            for(int j=0; j<arr.length; j++){
                if(arr[j].equals("+")){
                    result += Integer.parseInt(arr[j+1]);    
                }else if(arr[j].equals("-")){
                    result -= Integer.parseInt(arr[j+1]);
                }else if(arr[j].equals("=")){
                    s = Integer.toString(result);
                }
            }
            
            if(s.equals(arr[arr.length-1])){
                answer[i] = "O";
            }else{
                answer[i] = "X";
            }
        }
        
        return answer;
    }
}