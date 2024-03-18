public class Main {

	public static void main(String[] args) {

		int n = 0;
		int[] arr = new int[100000];

		for (int i = 1; i < 10000; i++) {

			if (i < 100) {

				n = i + (i / 10) + (i % 10);
				arr[n] = 1;

			}else if(i<1000) {
				n = i + ((i/100)+((i%100)/10)+((i%100)%10));
				arr[n] = 1;
			}else if(i<10000) {
				n = i + ((i/1000)+((i%1000)/100)+(((i%1000)%100)/10)+(((i%1000)%100)%10));
				arr[n] = 1;
			}

			if (arr[i] != 1) {
				System.out.println(i);
			}
		}
	}
}