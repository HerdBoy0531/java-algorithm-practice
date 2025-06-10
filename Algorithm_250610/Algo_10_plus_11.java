package algo250610;

import java.io.*;

public class Algo_10_plus_11 {

	public static void run(int N) {
		int[][] arr = new int[3][3];
		int cnt = 1;
		
		if(N<10) {
			for(int i = 0; i<3; i++) {
				for(int j = 0 ; j <3; j++) {
					arr[i][j] = cnt;
					cnt += 1;
				}
			}
		}
		else {
			for(int i = 0; i<3; i++) {
				for(int j = 2 ; j > -1; j--) {
					arr[i][j] = cnt;
					cnt += 1;
				}
			}
		}
		
		for(int i = 0; i<3; i++) {
			for(int j = 0 ; j <3; j++) {
				System.out.print(arr[i][j]);
			}
			System.out.println();
		}
	}
	
	public static void main(String[] args)throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int N = Integer.parseInt(br.readLine());
		run(N);
		
		bw.flush();
		br.close();
		bw.close();
	}

}
