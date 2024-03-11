import java.util.*;
import java.io.*;

public class Main {

	static int[][] arr;
	static boolean[] check;
	static int node, line, start;
	static int cnt = 0;
	
	public static void main(String[] args) throws IOException{

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		node = Integer.parseInt(br.readLine());
		line = Integer.parseInt(br.readLine());
		start = 1;
		
		arr = new int [node+1][node+1];
		check = new boolean[node+1];
		
		for(int i=0; i<line; i++) {
			st = new StringTokenizer(br.readLine());
			
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			
			arr[a][b] = arr[b][a] = 1;
		}

		dfs(start);
		System.out.println(cnt);	
	}
	
	public static void dfs(int start) {
		check[start] = true;
		
		for(int i=0; i<=node; i++) {
			if(arr[start][i] == 1 && !check[i]) {
				dfs(i);
				cnt++;	
			}
		}
	}
	

}
