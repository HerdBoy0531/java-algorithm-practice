package algo250610;

import java.io.*;

public class Algo_10_plus_02 {

	public static void main(String[] args)throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int N = Integer.parseInt(br.readLine());
		
		int[][] arr = new int[5][5];
		int cnt = 1;
		
		for(int i = 4; i > -1 ; i--) {
			for(int j = 0; j < 5; j++) {
				arr[j][i] = cnt;
				cnt += 1;
			}
		}
		
		for(int i = 0 ; i < 5; i ++) {
			arr[N][i] = N;
		}
		
		
		for(int i = 0; i < 5; i++) {
			for(int j = 0; j < 5; j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
		
		bw.flush();
		br.close();
		bw.close();
	}

}
