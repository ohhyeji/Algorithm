import java.io.*;
import java.util.*;

public class Main {

	static StringBuilder sb = new StringBuilder();

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int t = Integer.parseInt(br.readLine());
		int cnt = (int) Math.pow(2, t) - 1;

		sb.append(cnt + "\n");

		prime(t, 1, 2, 3);

		System.out.println(sb);

	}

	public static void prime(int num, int start, int mid, int end) {
		if (num == 1) {
			sb.append(start + " " + end + "\n");
			return;
		}

		prime(num - 1, start, end, mid);

		sb.append(start + " " + end + "\n");
		
		prime(num - 1, mid, start, end);

	}

}
