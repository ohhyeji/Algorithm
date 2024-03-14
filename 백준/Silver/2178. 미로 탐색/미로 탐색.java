import java.io.*;
import java.util.*;

public class Main {

	static int[] dx = { 1, -1, 0, 0 };
	static int[] dy = { 0, 0, 1, -1 };

	static int[][] arr;
	static boolean[][] check;

	static int h, w;
	static int cnt = 0;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		h = Integer.parseInt(st.nextToken());
		w = Integer.parseInt(st.nextToken());

		arr = new int[h][w];
		check = new boolean[h][w];

		for (int i = 0; i < h; i++) {
			String str = br.readLine();
			for (int j = 0; j < w; j++) {
				arr[i][j] = (int) (str.charAt(j) - '0');
			}
		}

		check[0][0] = true;
		bfs(0, 0);
		System.out.println(arr[h - 1][w - 1]);
	}

	public static void bfs(int x, int y) {
		Queue<int[]> q = new LinkedList<>();
		q.add(new int[] {x, y});
		
		while(!q.isEmpty()) {
			int[] now = q.poll();
			int nowX = now[0];
			int nowY = now[1];
			
			for(int i=0; i<4; i++) {
				int nx = nowX + dx[i];
				int ny = nowY + dy[i];
				
				if(nx >= 0 && ny >= 0 && nx < h && ny < w) {
					if(arr[nx][ny] != 0 && !check[nx][ny]) {
						q.add(new int[] {nx, ny});
						arr[nx][ny] = arr[nowX][nowY] + 1;
						check[nx][ny] = true;
					}
				}
			}
		}
	}

}
