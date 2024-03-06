import java.io.*;
import java.util.*;

public class Main {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Stack<Integer> stack = new Stack<>();
		
		int t = Integer.parseInt(br.readLine());
		int index = 1;
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		for(int i=0; i<t; i++) {
			int num = Integer.parseInt(st.nextToken());
			
			if(index <= num) {
				stack.push(num);
			}else if(index == num){
				if(!stack.isEmpty()) {
					stack.pop();
					index++;
				}
			}
			
			while(!stack.isEmpty()) {
				if(stack.peek() == index) {
					stack.pop();
					index++;
				}else {
					break;
				}
			}
		}	
		
		if(stack.isEmpty()) {
			System.out.println("Nice");			
		}else {
			System.out.println("Sad");
		}
		
		
	}

}
