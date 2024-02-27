class Solution {
    public int solution(int[] nums) {
        int answer = 0;
        int sum = 0;
        
        for(int i=0; i<nums.length-2; i++){
            for(int j=i+1; j<nums.length-1; j++){
                for(int k=j+1; k<nums.length; k++){
                    sum = nums[i]+nums[j]+nums[k];
                    
                    int cnt = 0;
                    for(int a=1; a<=sum; a++){
                        if(sum%a == 0){
                            cnt++;
                        }
                    }
                    
                    if(cnt==2){
                        answer++;
                    }
                }
            }
        }
        
        // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
        System.out.println("Hello Java");

        return answer;
    }
}