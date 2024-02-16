class Solution {
    public long solution(String numbers) {
        long answer = 0;
        String result = "";
        String[] num = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
        
        String str = "";
        for(int i=0; i<numbers.length(); i++){
            str += String.valueOf(numbers.charAt(i));
            for(int j=0; j<num.length; j++){
                if(str.equals(num[j])){
                    result += j;
                    str = "";
                }
            }
        }
        
        answer = Long.parseLong(result);
        
        return answer;
    }
}