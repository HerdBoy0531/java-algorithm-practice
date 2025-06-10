package algo250610;

import java.io.*;

public class Algo_11_plus_02 {

	public static int Count(int[][] arr, int N) {
		int cnt = 0;
		
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[i].length; j++) {
				if(arr[i][j] == N) cnt += 1;
			}
		}
		
		return cnt;
	}
	
	
	public static void main(String[] args)throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int[][] arr = new int[][] {
			{1, 1, 1},
			{1, 2, 1},
			{3, 6, 3},
		};
		
		int N = Integer.parseInt(br.readLine());
		int cnt = Count(arr, N);
		
		bw.write(cnt+" ");
		
		bw.flush();
		br.close();
		bw.close();
	}

}