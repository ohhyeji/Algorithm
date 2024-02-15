import java.util.*;
class Solution {
    public int solution(int[] numbers, int k) {
        Queue<Integer> q = new LinkedList<>();
        int answer = 0;
        
        for(int num : numbers){
            q.offer(num);
        }
        
        int cnt = 1;
        while(cnt != k){
            q.offer(q.poll());
            q.offer(q.poll());
            cnt++;
        }
        
        answer = q.peek();
        
        return answer;
    }
}