import java.io.*;
import java.util.*;

public class Main {

	static int[][] arr;
	static boolean[] check;
	
	static int node, line;
	static int cnt = 0;
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		node = Integer.parseInt(br.readLine());
		line = Integer.parseInt(br.readLine());
		
		arr = new int[node + 1][node + 1];
		check = new boolean[node + 1];
		
		StringTokenizer st;
		for(int i=0; i<line; i++) {
			st = new StringTokenizer(br.readLine());
			
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			
			arr[a][b] = arr[b][a] = 1;
		}
		
		bfs(1);
		
		System.out.println(cnt);
	}
	
	public static void bfs(int start) {
		check[start] = true;
		
		Queue<Integer> q = new LinkedList<>();
		q.offer(start);
		
		while(!q.isEmpty()) {
			start = q.poll();
			
			for(int i=1; i<=node; i++) {
				if(arr[start][i] == 1 && !check[i]) {
					cnt++;
					q.offer(i);
					check[i] = true;
				}
			}
		}
		
		
	}

}
