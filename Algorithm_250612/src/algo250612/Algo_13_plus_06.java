package algo250612;

import java.io.*;

public class Algo_13_plus_06 {

	// A, B, C 개수 구하는 함수
	public static void FindABC(String str1, String str2) {
		int A = 0;
		int B = 0;
		int C = 0;
		
		for(int i = 0; i < str1.length(); i++ ) {
			if(str1.charAt(i) == 'A') A += 1;
			else if(str1.charAt(i) == 'B') B += 1;
			else if(str1.charAt(i) == 'C') C += 1;
		}

		for(int i = 0; i < str2.length(); i++ ) {
			if(str2.charAt(i) == 'A') A += 1;
			if(str2.charAt(i) == 'B') B += 1;
			if(str2.charAt(i) == 'C') C += 1;
		}
		
		System.out.println("A:"+A);
		System.out.println("B:"+B);
		System.out.println("C:"+C);
	}
	
	
	public static void main(String[] args)throws IOException  {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		String str1 = br.readLine();
		String str2 = br.readLine();
		FindABC(str1, str2);
		
		bw.flush();
		br.close();
		bw.close();
	}

}
