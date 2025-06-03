package algo_250603;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CT_chapter2_L1_6 {

	public static void Num(int N) {
		if(N==0) return;
		for(int i = 0; i<N; i++) {
			System.out.printf("* ");
		}
		System.out.println();
		Num(N-1);
		for(int i = 0; i<N; i++) {
			System.out.printf("* ");
		}
		System.out.println();
		return;
	}
	

	public static void main(String[] args)throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int A = Integer.parseInt(br.readLine());
		Num(A);
		

	}

}
