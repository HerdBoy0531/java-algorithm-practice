package algo250611;

import java.io.*;

public class Algo_12_07 {

	public static void main(String[] args)throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		String[] arr = br.readLine().split("");
		char A = br.readLine().charAt(0);
		char B = br.readLine().charAt(0);
		char C = br.readLine().charAt(0);
		
		int resA = 0;
		int resB = 0;
		int resC = 0;
		
		for(int i = 0; i < arr.length ; i++) {
			if(arr[i].charAt(0) == A) resA += 1;
			if(arr[i].charAt(0) == B) resB += 1;
			if(arr[i].charAt(0) == C) resC += 1;
		}
		
		bw.write(A+"="+resA+"\n");
		bw.write(B+"="+resB+"\n");
		bw.write(C+"="+resC+"\n");
		
		bw.flush();
		br.close();
		bw.close();
	}

}
