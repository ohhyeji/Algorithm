import java.io.*;
import java.util.*;

public class Main {

	static int[] dx = {1, -1, 0, 0};
	static int[] dy = {0, 0, 1, -1};
	
	static boolean[][] check;
	static String[][] arr;
	
	static int nomalcnt, unnomalcnt = 0;
	static int t;
	
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		t = Integer.parseInt(br.readLine());
		
		arr = new String[t][t];
		check = new boolean[t][t];
		
		for(int i=0; i<t; i++) {
			String s = br.readLine();
			for(int j=0; j<s.length(); j++) {
				arr[i][j] = String.valueOf(s.charAt(j));
			}
		}
		
		for(int i=0; i<t; i++) {
			for(int j=0; j<t; j++) {
				if(!check[i][j]) {
					dfs(i, j);
					nomalcnt++;
				}
			}
		}

		check = new boolean[t][t];
		
		for(int i=0; i<t; i++) {
			for(int j=0; j<t; j++) {
				if(arr[i][j].equals("G")) {
					arr[i][j] = "R";
				}
			}
		}

		for(int i=0; i<t; i++) {
			for(int j=0; j<t; j++) {
				if(!check[i][j]) {
					dfs(i, j);
					unnomalcnt++;
				}
			}
		}
		
		System.out.println(nomalcnt + " " + unnomalcnt);
	}
	
	public static void dfs(int x, int y) {
		check[x][y] = true;
		String str = arr[x][y];
		
		for(int i=0; i<4; i++) {
			int nx = x + dx[i];
			int ny = y + dy[i];
			
			if(nx >=0 && ny >= 0 && nx < t && ny < t) {
				if(arr[nx][ny].equals(str) && !check[nx][ny]) {
					dfs(nx,ny);
				}
			}
		}
	}


}
