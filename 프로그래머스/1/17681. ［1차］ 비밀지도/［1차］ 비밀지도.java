class Solution {
    public String[] solution(int n, int[] arr1, int[] arr2) {
        String[] answer = new String[n];
        String[] bin1 = new String[n];
        String[] bin2 = new String[n];
        
        for(int i=0; i<arr1.length; i++){
            bin1[i] = Integer.toString(arr1[i], 2);
            String s = "";
            
            if(bin1[i].length() != n){
                for(int j=0; j<n-bin1[i].length(); j++){
                    s += "0";
                }
                bin1[i] = s + bin1[i];
            }
        }
        
        for(int i=0; i<arr2.length; i++){
            bin2[i] = Integer.toString(arr2[i], 2);
            String s = "";
            
            if(bin2[i].length() != n){
                for(int j=0; j<n-bin2[i].length(); j++){
                    s += "0";
                }
                bin2[i] = s + bin2[i];
            }
        }
        
        for(int i=0; i<answer.length; i++){
            answer[i] = "";
            for(int j=0; j<bin1[i].length(); j++){
                String s1 = String.valueOf(bin1[i].charAt(j));
                String s2 = String.valueOf(bin2[i].charAt(j));
                
                if(s1.equals("0") && s2.equals("0")){
                    answer[i] += " ";
                }else{
                    answer[i] += "#";
                }
            }
        }
        
        
        return answer;
    }
}