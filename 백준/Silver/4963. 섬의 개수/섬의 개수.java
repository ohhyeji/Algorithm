import java.io.*;
import java.util.*;

public class Main {

	static int[] dx = {1, -1, 0, 0, 1, 1, -1, -1};
	static int[] dy = {0, 0, 1, -1, -1, 1, -1, 1};
	
	static int[][] arr;
	static boolean[][] check;
	
	static int w, h;
	static Queue<int[]> q = new LinkedList<>();
	static StringBuilder sb = new StringBuilder();
	public static void main(String[] args) throws IOException{

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
	
		while(true) {
			st = new StringTokenizer(br.readLine());
			
			h = Integer.parseInt(st.nextToken());
			w = Integer.parseInt(st.nextToken());

			if(w == 0 && h == 0) {
				break;
			}
			
			arr = new int[w][h];
			check = new boolean[w][h];
			
			for(int i=0; i<w; i++) {
				st = new StringTokenizer(br.readLine());
				for(int j=0; j<h; j++) {
					arr[i][j] = Integer.parseInt(st.nextToken());
				}
			}

			int cnt = 0;
			for(int i=0; i<w; i++) {
				for(int j=0; j<h; j++) {
					if(arr[i][j] == 1 && !check[i][j]) {
						bfs(i, j);
						cnt++;
					}
				}
			}

			
			sb.append(cnt).append('\n');
		}
		System.out.println(sb);
	}

	public static void bfs(int x, int y) {
		q.offer(new int[] {x, y});
		check[x][y] = true;

		while(!q.isEmpty()) {
			int[] now = q.poll();
			int nowX = now[0];
			int nowY = now[1];
			
			for(int i=0; i<8; i++) {
				int nx = nowX + dx[i];
				int ny = nowY + dy[i];
				
				if(nx >= 0 && ny >= 0 && nx < w && ny < h) {
					if(arr[nx][ny] == 1 && !check[nx][ny]) {
						q.offer(new int[] {nx, ny});
						check[nx][ny] = true;
					}
				}
			}
		}
	}
}
