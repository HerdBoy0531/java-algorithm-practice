package algo250610;

import java.io.*;

public class Algo_11_11 {

	public static void main(String[] args)throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int N = Integer.parseInt(br.readLine());
		
		int arr[][] = new int[][] {
			{1, 3, 6, 2},
			{4, 2, 4, 5},
			{6, 3, 7, 3},
			{1, 5, 4, 6},
		};
		
		int[] select = new int[16];
		int cntBig = 0;
		
		
		for(int i = 0; i < 4; i++) {
			for(int j = 0; j < 4; j++) {
				if(arr[i][j]>N) {
					select[cntBig]=arr[i][j];
					cntBig += 1;
				}
			}
		}
		
		for(int i = 0 ; i < select.length; i++) {
			if(select[i] != 0) {
				bw.write(select[i]+" ");
			}
		}
		
		bw.flush();
		br.close();
		bw.close();
	}

}