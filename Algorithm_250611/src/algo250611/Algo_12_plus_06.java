package algo250611;

import java.io.*;

public class Algo_12_plus_06 {

	public static void main(String[] args)throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		String A = br.readLine();
		
		int len = A.length();
		int cnt = 0;
		for(int i = 0; i < len; i++) {
			if(A.charAt(len-1) == A.charAt(i)) cnt += 1;
		}
		
		bw.write(len+"\n");
		bw.write(cnt+"");
		
		
		
		
		bw.flush();
		br.close();
		bw.close();
	}

}
