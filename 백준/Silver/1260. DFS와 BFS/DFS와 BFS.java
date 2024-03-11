import java.io.*;
import java.util.*;

public class Main {

	static int[][] arr;
	static boolean[] check;
	static int node, line, start;
	static StringBuilder sb = new StringBuilder();
	
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		node = Integer.parseInt(st.nextToken());
		line = Integer.parseInt(st.nextToken());
		start = Integer.parseInt(st.nextToken());

		arr = new int[node+1][node+1];
		check = new boolean[node+1];
		
		for(int i=0; i<line; i++) {
			st = new StringTokenizer(br.readLine());
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			
			arr[a][b] = arr[b][a] = 1;
		}
		
		dfs(start);
		sb.append('\n');
		check = new boolean[node+1];
		
		bfs(start);
		System.out.println(sb);
	}
	
	public static void dfs(int start) {
		check[start] = true;
		sb.append(start).append(" ");
		
		for(int i=0; i<=node; i++) {
			if(arr[start][i] == 1 && !check[i]) {
				dfs(i);
			}
		}
		
	}
	
	public static void bfs(int start) {
		Queue<Integer> q = new LinkedList<>();
		
		check[start] = true;
		q.offer(start);
		
		while(!q.isEmpty()) {
			start = q.poll();
			sb.append(start + " ");
			
			for(int i=0; i<=node; i++) {
				if(arr[start][i] == 1 && !check[i]) {
					q.offer(i);
					check[i] = true;
				}
			}
		}
	}

}
