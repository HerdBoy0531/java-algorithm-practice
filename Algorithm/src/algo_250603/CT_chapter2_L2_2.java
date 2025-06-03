package algo_250603;

import java.io.*;

public class CT_chapter2_L2_2 {
	
	public static int count = 0;
	
	public static void Func(int lev, String A) {
		if(lev == A.length()) {
			System.out.print(count);
			return;
		}
		int numA = Character.getNumericValue(A.charAt(lev));
		count += (numA*numA);
		Func(lev+1, A);
	}

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String A = br.readLine();
		Func(0, A);

	}

}
