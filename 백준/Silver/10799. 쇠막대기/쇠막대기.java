import java.io.*;
import java.util.*;

public class Main {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Stack<Character> stack = new Stack<>();
		
		int answer = 0;
		String l = br.readLine();
		
		for(int i=0; i<l.length(); i++) {
			if(l.charAt(i) == '(') {
				stack.push('(');
			}else if(l.charAt(i) == ')') {
				
				if(l.charAt(i-1) == '(') {
					stack.pop();
					answer += stack.size();
				}else if(l.charAt(i-1) == ')') {
					answer +=1;
					stack.pop();
				}
			}
		}
		
		System.out.println(answer);
	}
	

}
