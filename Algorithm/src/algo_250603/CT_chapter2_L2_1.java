package algo_250603;

import java.io.*;

public class CT_chapter2_L2_1 {
	
	public static int count = 0;
	
	public static void Plus(int lev, int N) {
		if(lev == N+1) {
			System.out.print(count);
			return;
		}
		count += lev;
		Plus(lev+1, N);
	}
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int A = Integer.parseInt(br.readLine());
		Plus(1, A);
	}

}
