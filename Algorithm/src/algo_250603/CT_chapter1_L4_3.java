package algo_250603;

import java.io.*;

public class CT_chapter1_L4_3 {

	public static void Func(String[] A, int a1, int a2) {
		int count = 0;
		for(int i = a1-1; i < a2; i++) {
			count += Integer.parseInt(A[i]);
		}
		System.out.print(count);
		System.out.println();
	}
	
	public static void main(String[] args)throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] arr = br.readLine().split(" ");
		int N = Integer.parseInt(arr[0]);
		int M = Integer.parseInt(arr[1]);
		// A 배열 받음
		String[] A = br.readLine().split(" ");
		for(int i = 0; i<M;i++) {
			String[] sted = br.readLine().split(" ");
			int st = Integer.parseInt(sted[0]);
			int ed = Integer.parseInt(sted[1]);
			Func(A, st, ed);
		}
	}

}
