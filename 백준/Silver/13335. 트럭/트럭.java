import java.io.*;
import java.util.*;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		int t = Integer.parseInt(st.nextToken());
		int w = Integer.parseInt(st.nextToken());
		int l = Integer.parseInt(st.nextToken());

		Queue<Integer> truck = new LinkedList<>();
		st = new StringTokenizer(br.readLine());
		for (int i = 0; i < t; i++) {
			int x = Integer.parseInt(st.nextToken());
			truck.offer(x);
		}

		int time = 0;
		int bridge = 0;
		Queue<Integer> q = new LinkedList<>();
		for (int i = 0; i < w; i++) {
			q.offer(0);
		}

		while (!q.isEmpty()) {
			time++;
			bridge -= q.poll();

			if (!truck.isEmpty()) {
				if (truck.peek() + bridge <= l) {
					bridge += truck.peek();
					q.offer(truck.poll());
				} else {
					q.offer(0);
				}
			}
		}

		System.out.println(time);
	}

}
