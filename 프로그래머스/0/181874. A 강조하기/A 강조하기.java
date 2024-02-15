class Solution {
    public String solution(String myString) {
        myString = myString.toLowerCase();
        String answer = myString;
        answer = answer.replaceAll("a", "A");
        return answer;
    }
}