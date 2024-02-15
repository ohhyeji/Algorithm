class Solution {
    public int[] solution(int[] arr, int[] delete_list) {
        int cnt = 0;
        
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<delete_list.length; j++){
                if(arr[i] == delete_list[j]){
                    cnt++;
                    arr[i] = -1;
                }
            }
        }

        int[] answer = new int[arr.length-cnt];
        
        int index=0;
        
        for(int i=0; i<arr.length; i++){
            if(arr[i] > 0){
                answer[index++] = arr[i];
            }
        }
        
        return answer;
    }
}