import java.io.*;
import java.util.*;

public class Main {

	static StringBuilder sb = new StringBuilder();
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		String str;
		
		while(true) {
			str = br.readLine();
			
			if(str.equals(".")) {
				break;
			}
			
			sb.append(check(str)).append('\n');
		}
		
		System.out.println(sb);
		
	}
	
	public static String check(String s) {
		Stack<Character> stack = new Stack<>();
		
		for(int i=0; i<s.length(); i++) {
			char c = s.charAt(i);
			
			if(c == '(' || c == '[') {
				stack.push(c);
			}else if(c == ')'){
				if(stack.isEmpty() || stack.peek() != '(' ) {
					return "no";
				}else {
					stack.pop();
				}
			}else if(c == ']') {
				if(stack.isEmpty() || stack.peek() != '[' ) {
					return "no";
				}else {
					stack.pop();
				}
			}
			
		}
		
		if(stack.isEmpty()) {
			return "yes";
		}else {
			return "no";
		}
	}

}
