package algo250611;

import java.io.*;

public class Algo_12_plus_08 {

	public static void main(String[] args)throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int[][] arr = new int[3][3];
		int N = Integer.parseInt(br.readLine());
		int cnt = 0;
		
		for(int i = 0; i < 3; i++) {
			for(int j = 2-i; j < 3; j++) {
				arr[i][j] = N + cnt;
				cnt++;
			}	
		}
		
		for(int i = 0; i < 3; i++) {
			for(int j = 0; j < 3; j++) {
				bw.write(arr[i][j]+"");
			}	
			bw.write("\n");
		}
		
		
		bw.flush();
		br.close();
		bw.close();
	}

}
