import java.io.*;
import java.util.*;

public class Main {

	static int[] dx = {1, -1, 0, 0};
	static int[] dy = {0, 0, 1, -1};
	
	static int[][] arr;
	static boolean[][] check;
	
	static int m,n;
	static int day = 0;
	static Queue<int[]> q = new LinkedList<int[]>(); 
	
	public static void main(String[] args) throws IOException{

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		m = Integer.parseInt(st.nextToken());
		n = Integer.parseInt(st.nextToken());
		
		arr = new int[n][m];
		check = new boolean[n][m];
		
		for(int i=0; i<n; i++) {
			st = new StringTokenizer(br.readLine());
			for(int j=0; j<m; j++) {
				arr[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		
		for(int i=0; i<n; i++) {
			for(int j=0; j<m; j++) {
				if(arr[i][j] == 1 && !check[i][j]) {
					q.add(new int[] {i,j});
				}
			}
		}

		bfs();
		
		for(int i=0; i<n; i++) {
			for(int j=0; j<m; j++) {
				if(arr[i][j] == 0) {
					System.out.println(-1);
					return;
				}
				day = Math.max(day, arr[i][j]);
			}
		}
		
		System.out.println(day-1);
	}
	
	public static void bfs() {
		
		while(!q.isEmpty()) {
			int[] now = q.poll();
			int nowX = now[0];
			int nowY = now[1];
			
			for(int i=0; i<4; i++) {
				int nx = nowX + dx[i];
				int ny = nowY + dy[i];
				
				if(nx >= 0 && ny >= 0 && nx < n && ny < m) {
					if(arr[nx][ny] == 0 && !check[nx][ny]) {
						arr[nx][ny] = arr[nowX][nowY]+1;
						check[nx][ny] = true;
						q.add(new int[] {nx, ny});
					}
				}
			}
		}
	}

}
