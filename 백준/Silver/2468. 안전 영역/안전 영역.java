import java.io.*;
import java.util.*;

public class Main {

	static int[] dx = { 1, -1, 0, 0 };
	static int[] dy = { 0, 0, 1, -1 };

	static int[][] arr;
	static boolean[][] check;

	static int t;
	static int cnt = 0;

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		t = Integer.parseInt(br.readLine());

		arr = new int[t][t];

		int maxheight = 0;
		for (int i = 0; i < t; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			for (int j = 0; j < t; j++) {
				arr[i][j] = Integer.parseInt(st.nextToken());

				if (arr[i][j] > maxheight) {
					maxheight = arr[i][j];
				}
			}
		}

		int max = 0;
		for (int height = 0; height < maxheight + 1; height++) {
			check = new boolean[t][t];
			cnt = 0;
			for (int i = 0; i < t; i++) {
				for (int j = 0; j < t; j++) {
					if (!check[i][j] && arr[i][j] > height) {
						cnt += dfs(i, j, height);
					}
				}

			}
			max = Math.max(max, cnt);
		}

		System.out.println(max);
	}

	public static int dfs(int x, int y, int height) {
		check[x][y] = true;

		for (int i = 0; i < 4; i++) {
			int nx = x + dx[i];
			int ny = y + dy[i];

			if (nx >= 0 && ny >= 0 && nx < t && ny < t) {
				if (arr[nx][ny] > height && !check[nx][ny]) {
					dfs(nx, ny, height);
				}
			}
		}

		return 1;
	}

}
