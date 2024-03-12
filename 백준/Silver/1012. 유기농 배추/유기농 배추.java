import java.io.*;
import java.util.*;

public class Main {

	public static int m, n, k;
	public static int [][] arr;
	public static boolean [][] check;
	public static int [] dx = {-1, 1, 0, 0};
	public static int [] dy = {0, 0 , -1, 1};
	public static int count = 0;
	
	public static void main(String[] args) throws IOException{

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
		int t = Integer.parseInt(br.readLine());
		
		for(int i=0; i<t; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			m = Integer.parseInt(st.nextToken());
			n = Integer.parseInt(st.nextToken());
			k = Integer.parseInt(st.nextToken());
			
			arr = new int [m][n];
			check = new boolean [m][n];
			count = 0;
			
			for(int j=0; j<k; j++) {
				st = new StringTokenizer(br.readLine());
				int p1 = Integer.parseInt(st.nextToken());
				int p2 = Integer.parseInt(st.nextToken());
				arr[p1][p2] = 1;
			}
			
			for(int a=0; a<m; a++) {
				for(int b=0; b<n; b++) {
					if(arr[a][b] == 1 && !check[a][b]) {
						bfs(a, b);
						count++;
					}
				}
			}
			System.out.println(count);
		}		
		
	}
	
	public static void bfs(int x, int y) {
		Queue<int[]> q = new LinkedList<int[]>();
		q.add(new int[] {x, y});
		
		while(!q.isEmpty()) {
			x = q.peek()[0];
			y = q.peek()[1];
			check[x][y] = true;
			q.poll();
			
			for(int i=0; i<4; i++) {
				int cx = x + dx[i];
				int cy = y + dy[i];
				
				if(cx >= 0 && cy >=0 && cx <m && cy < n) {
					if(arr[cx][cy] == 1 && !check[cx][cy]) {
						q.add(new int[] {cx, cy});
						check[cx][cy] = true;
					}
				}
			}
		}
	}

}
