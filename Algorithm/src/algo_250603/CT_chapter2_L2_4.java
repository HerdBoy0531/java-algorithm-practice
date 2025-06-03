package algo_250603;

import java.io.*;

public class CT_chapter2_L2_4 {
	public static int[] pibonachi = new int[]{0,1,1};
	
	public static int Func(int N) {
		if(N==1||N==2)
			return 1;
		return Func(N-1) + Func(N-2);
	}
	
	
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int Num = Integer.parseInt(br.readLine());
		System.out.print(Func(Num));

	}

}
