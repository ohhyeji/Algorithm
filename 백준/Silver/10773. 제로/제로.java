import java.io.*;
import java.util.*;

public class Main {

	public static void main(String[] args) throws IOException{

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Stack<Integer> stack = new Stack<>();
		
		int t = Integer.parseInt(br.readLine());
		int answer = 0;
		
		for(int i=0; i<t; i++) {
			int num = Integer.parseInt(br.readLine());

			if(num==0) {
				stack.pop();
			}else {
				stack.add(num);
			}
		}
		
		for(int x : stack) {
			answer+=x;
		}
		
		System.out.println(answer);
	}

}
