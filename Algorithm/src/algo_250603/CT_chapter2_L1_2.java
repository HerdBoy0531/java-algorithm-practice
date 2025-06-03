package algo_250603;
// 재귀 함수 2개 작성해라

import java.io.*;

public class CT_chapter2_L1_2 {

	public static void Func1(int lev, int N) {
		if(lev == N+1) return;
		System.out.printf("%d ",lev);
		Func1(lev+1, N);
		return;
	}
	
	public static void Func2(int N) {
		if(N == 0) return;
		System.out.printf("%d ",N);
		Func2(N-1);
		return;
	}
	
	public static void main(String[] args)throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int A = Integer.parseInt(br.readLine());
		Func1(1, A);
		System.out.println();
		Func2(A);
		

	}

}
