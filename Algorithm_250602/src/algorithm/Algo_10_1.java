package algorithm;

import java.io.*;

public class Algo_10_1 {
	public static int One()throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int A = Integer.parseInt(br.readLine());
		return A;
	}
	
	public static char Two()throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String A = br.readLine();
		
	    if (A == null || A.isEmpty()) {
	        throw new IllegalArgumentException("문자 하나 이상 입력해야 합니다.");
	    }
		
		char result = A.charAt(0);
		return result;
	}
	
	
	public static void main(String[] args)throws IOException {
		int intRes = One();
		char charRes = Two();
		System.out.printf("%d%c", intRes, charRes);
	}
}
