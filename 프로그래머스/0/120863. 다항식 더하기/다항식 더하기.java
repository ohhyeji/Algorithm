class Solution {
    public String solution(String polynomial) {
        String answer = "";
        String[] arr = polynomial.split(" ");
        int a = 0;
        int b = 0;
        
        for(int i=0; i<arr.length; i++){
            if(arr[i].contains("x")){
                String x = arr[i].substring(0,arr[i].length()-1); 
                if(x.equals("")){
                    a += 1;
                }else{
                    a += Integer.parseInt(x);
                }
            }else if(arr[i].equals("+")){
                continue;
            }else{
                b += Integer.parseInt(arr[i]);
            }
        }
        
        if(a == 1 && b != 0){
            answer = "x + " + Integer.toString(b); 
        }else if(a == 1 && b == 0){
            answer = "x";
        }else if(a != 0 && b != 0){
            answer = Integer.toString(a) + "x + " + Integer.toString(b);
        }else if(a != 0 && b == 0){
            answer = Integer.toString(a) + "x";
        }else if(a == 0 && b != 0){
            answer = Integer.toString(b);
        }
        
        return answer;
    }
}