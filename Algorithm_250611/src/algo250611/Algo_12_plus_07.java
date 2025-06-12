package algo250611;

import java.io.*;

public class Algo_12_plus_07 {

	public static void main(String[] args)throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		String A = br.readLine();
		String B = br.readLine();
		String C = br.readLine();
		
		int lenA = A.length();
		int lenB = B.length();
		int lenC = C.length();
		
		if(Math.max(lenA, Math.max(lenB, lenC)) == lenA) bw.write(A);
		else if(Math.max(lenA, Math.max(lenB, lenC)) == lenB) bw.write(B);
		else bw.write(C);
		
		
		
		bw.flush();
		br.close();
		bw.close();
	}

}
