package algo250611;

import java.io.*;

public class Algo_12_06 {
	
	public static char[] arr = new char[] {'M', 'I', 'N', 'Q', 'U', 'E', 'S', 'T'};

	public static int Length(char N) {
		for(int i = 0; i < arr.length; i ++) {
			if(arr[i] == N) return i;
		}
		return 0;
	}
	
	public static void main(String[] args)throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		char A = br.readLine().charAt(0);
		char B = br.readLine().charAt(0);
		char C = br.readLine().charAt(0);
		
		int res1 = Length(A);
		int res2 = Length(B);
		int res3 = Length(C);
		
		bw.write(A+"="+res1+"\n");
		bw.write(B+"="+res2+"\n");
		bw.write(C+"="+res3+"\n");
		
		
		
		bw.flush();
		br.close();
		bw.close();
	}

}
