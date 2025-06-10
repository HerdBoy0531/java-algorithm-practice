package algo250610;

import java.io.*;

public class Algo_10_plus_06 {

	public static void main(String[] args)throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		String[] strs = br.readLine().split(" ");
		
		int N = Integer.parseInt(strs[0]);
		int M = Integer.parseInt(strs[1]);
		
		
		int[][] arr = new int[6][3];
		int cnt = 0;
		for(int i = 0; i < 3; i++) {
			for(int j = 0; j < 6 ; j++) {
				arr[j][i] = 10+cnt;
				cnt += 1;
			}
		}
		
		for(int i = N; i <= M; i++) {
			for(int j = 0; j < 3; j++) {
				arr[i][j] = 7;
			}
		}
		
		for(int i = 0; i < 6; i++) {
			for(int j = 0; j < 3; j++) {
				bw.write(arr[i][j]+" ");
			}
			bw.write("\n");
		}
		
		
		
		bw.flush();
		br.close();
		bw.close();
	}

}
