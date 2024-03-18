import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(br.readLine());
		int[] weight = new int[n];
		int[] height = new int[n];

		for (int i = 0; i < n; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());

			weight[i] = Integer.parseInt(st.nextToken());
			height[i] = Integer.parseInt(st.nextToken());
		}

		int[] ranks = new int[n];

		for (int i = 0; i < n; i++) {
			int rank = 1;

			for (int j = 0; j < n; j++) {
				if (weight[i] < weight[j] && height[i] < height[j]) {
					rank++;
				} 
			}

			ranks[i] = rank;
		}

		for (int i = 0; i < n; i++) {
			System.out.print(ranks[i]+" ");
		}

	}

}
