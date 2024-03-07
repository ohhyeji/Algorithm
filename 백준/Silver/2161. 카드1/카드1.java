import java.io.*;
import java.util.*;

public class Main {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		Queue<Integer> q = new LinkedList<Integer>();
		
		int num = Integer.parseInt(br.readLine());
		
		for(int i=0; i<num; i++) {
			q.offer(i+1);
		}
		
		while(q.size() != 1) {
			sb.append(q.poll()).append(' ');
			q.offer(q.poll());
		}
		
		sb.append(q.poll());
		
		System.out.println(sb);
	}

}
