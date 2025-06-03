package algo_250603;

import java.io.*;

public class CT_chapter1_L4_2 {
	public static int count = 0;

	public static void Func(String[] arr, int M) {
		count += Integer.parseInt(arr[M-1]);
	}
	
	public static void main(String[] args)throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] NM = br.readLine().split(" ");
		String[] arr = br.readLine().split(" ");
		// arr의 길이
		int N = Integer.parseInt(NM[0]);
		// 기준 숫자
		int M = Integer.parseInt(NM[1]);
		
		
		while(M>0) {
			if(M%2==0) {
				Func(arr, M);
				M /= 2;
			}
			else {
				Func(arr,M);
				M -= 1;
			}
		}
		
		System.out.print(count);
	}

}
