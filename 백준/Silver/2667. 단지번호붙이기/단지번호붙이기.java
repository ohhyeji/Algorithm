import java.util.*;
import java.io.*;

public class Main {

	static int dx[] = { 0, 0, 1, -1 };
	static int dy[] = { 1, -1, 0, 0 };

	static int[] aparts = new int[25 * 25];
	static int cnt = 0;
	static int n;

	static int[][] arr = new int[25][25];
	static boolean[][] check = new boolean[25][25];

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		n = Integer.parseInt(br.readLine());

		arr = new int[n][n];
		check = new boolean[n][n];

		for (int i = 0; i < n; i++) {
			char[] strArr = br.readLine().toCharArray();
			for (int j = 0; j < n; j++) {
				arr[i][j] = strArr[j] - '0';
			}
		}
		
		for(int i=0; i<n; i++) {
			for(int j=0; j<n; j++) {
				if(arr[i][j]==1 && !check[i][j]) {
					cnt++;
					bfs(i,j);
				}
			}
		}
		
		Arrays.sort(aparts);
		System.out.println(cnt);
		
		for(int i=0; i<aparts.length; i++) {
			if(aparts[i] == 0) {
			}else {
				System.out.println(aparts[i]);
			}
		}

	}
	
	public static void bfs(int x, int y) {
		Queue<int[]>q = new LinkedList<>();
		q.add(new int[] {x,y});
		check[x][y] = true;
		aparts[cnt]++;
		
		while(!q.isEmpty()) {
			int curX = q.peek()[0];
			int curY = q.peek()[1];
			q.poll();
			
			for(int i=0; i<4; i++) {
				int nx = curX + dx[i];
				int ny = curY + dy[i];
				
				if(nx >= 0 && ny >= 0 && nx<n && ny <n) {
					if(arr[nx][ny] == 1 && !check[nx][ny]) {
						q.add(new int[] {nx, ny});
						check[nx][ny] = true;
						aparts[cnt]++;
					}
				}
			}
		}
	}

}
