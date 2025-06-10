package algo250610;

import java.io.*;

public class Algo_10_plus_12 {

	public static int yesOrNo()throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		
		if(N % 3 == 0) return 7;
		else if(N % 3 == 1) return 35;
		else return 50;
	}
	
	
	public static void main(String[] args)throws IOException {
		int res = yesOrNo();
		System.out.print(res);
	}

}
