package algorithm;

import java.io.*;

public class Algo_10_3 {
	public static int chicken()throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int A = Integer.parseInt(br.readLine());
		A += 10;
		return A;
	}
	
	public static String coke()throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String B = br.readLine();
		return B;
	}	
	
	
	public static void KFC()throws IOException{
		int A = chicken();
		String B = coke();
		char C = B.charAt(0);
		System.out.printf("%d%c", A, C);
	}	
	
	
	public static void main(String[] args)throws IOException{
		KFC();
	}
}
