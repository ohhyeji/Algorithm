import java.io.*;
import java.util.*;

public class Main {

	public static void main(String[] args) throws IOException{

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
	
		int[] arr = new int[11];
		
		arr[0] = 0;
		arr[1] = 1;
		arr[2] = 2;
		arr[3] = 4;
		
		int a = 0;
		
		for(int i=0; i<n; i++) {
			a = Integer.parseInt(br.readLine());
			for(int j = 4; j<=a; j++) {
				arr[j] = arr[j-1] + arr[j-2] + arr[j-3];
			}
			System.out.println(arr[a]);
		}
		
	}
	
}
