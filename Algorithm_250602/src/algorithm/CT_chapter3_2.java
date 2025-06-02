package algorithm;

import java.io.*;

public class CT_chapter3_2 {
	public static int[] isOdd(int[] arr, int N) {
		for(int i = 0; i < N; i++) {
			if(arr[i] % 2 == 0) {
				arr[i] /= 2;
			}
		}
		return arr;
	}
	
	
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		String[] strArr = br.readLine().split(" ");
		
		int[] intArr = new int[N];
		for(int i=0; i < N; i++) {
			intArr[i] = Integer.parseInt(strArr[i]);
		}
		
		int[] result = isOdd(intArr, N);
		
		for(int i = 0 ; i < N; i++) {
			System.out.print(result[i] + " ");
		}
		
	}
}
