package algo_250603;

import java.io.*;

public class CT_chapter2_L2_3 {

	public static void TheOne(int lev, int N) {
		if(N == 1) {
			System.out.print(lev);
			return;
		}
		if(N%2==0) {
			TheOne(lev+1, N/2);
		}
		else {
			TheOne(lev+1, N/3);
		}
	}
	
	
	
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int Num = Integer.parseInt(br.readLine());
		TheOne(0, Num);

	}

}
