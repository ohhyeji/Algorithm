import java.io.*;
import java.util.*;

public class Main {

	static int node, line;
	static int cnt = 0;
	
	static int[][] arr;
	static boolean[] check;
	
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		node = Integer.parseInt(st.nextToken());
		line = Integer.parseInt(st.nextToken());
		
		arr = new int[node + 1][node + 1];
		check = new boolean[node + 1];
		
		for(int i=0; i<line; i++) {
			st = new StringTokenizer(br.readLine());
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			
			arr[a][b] = arr[b][a] = 1;
		}
		
		for(int i=1; i<=node; i++) {
			if(!check[i]) {
				dfs(i);
				cnt++;
			}
		}
		
		System.out.println(cnt);
	}
	
	public static void dfs(int start) {
		check[start] = true;
		
		for(int i=1; i<=node; i++) {
			if(arr[start][i] == 1 && !check[i]) {
				dfs(i);
			}
		}
	}

}
