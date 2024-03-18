import java.io.*;
import java.util.*;

public class Main {

	public static void main(String[] args) throws IOException{

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		
		int count = 0;
		
		for(int i=1; i<=n; i++) {
			if(i < 100) {
				count++;
			}else {
				
				int hun = i / 100;
				int ten = (i/10)%10; 
				int one = i%10;
				
				if((hun - ten) == (ten-one)) {
					count++;
				}
			}
		}
		
		System.out.println(count);
	}

}
