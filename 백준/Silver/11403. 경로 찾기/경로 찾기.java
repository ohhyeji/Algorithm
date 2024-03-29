import java.io.*;
import java.util.*;

public class Main {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int t = Integer.parseInt(br.readLine());

		int[][] arr = new int[t][t];

		StringTokenizer st;
		for (int i = 0; i < t; i++) {
			st = new StringTokenizer(br.readLine());
			for (int j = 0; j < t; j++) {
				arr[i][j] = Integer.parseInt(st.nextToken());
			}
		}

		for (int k = 0; k < t; k++) {
			for (int i = 0; i < t; i++) {
				for (int j = 0; j < t; j++) {
					if (arr[i][k] == 1 && arr[k][j] == 1) {
						arr[i][j] = 1;
					}
				}
			}
		}

		StringBuilder sb = new StringBuilder();
		
		for(int i=0; i<t; i++) {
			for(int j=0; j<t; j++) {
				sb.append(arr[i][j] + " ");
			}
			sb.append("\n");
		}
		
		System.out.println(sb);
		
	}

}
