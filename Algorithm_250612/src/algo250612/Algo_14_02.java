package algo250612;

import java.io.*;

public class Algo_14_02 {

	public static void main(String[] args)throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int res[] = new int[5];
		for(int i = 0; i < 5; i++) {
			String[] arr = br.readLine().split(" ");
			for(int j = 0; j < 4; j++) {
				res[i] += Integer.parseInt(arr[j]);
			}
		}
		
		for(int i = 0; i < 5; i++) {
			bw.write(res[i]+" ");
		}
	
		bw.flush();
		br.close();
		bw.close();
	}

}
