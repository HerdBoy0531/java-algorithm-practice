package algo250612;

import java.io.*;

public class Algo_14_05 {

	public static void main(String[] args)throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int[][] lst = new int[3][3];
		for(int i = 0; i < 3; i++) {
			String[] arr = br.readLine().split(" ");
			for(int j = 0; j < 3;j++) {
				lst[i][j] = Integer.parseInt(arr[j]);
			}
		}
		
		int res = 0;
		for(int i = 0 ; i < 3; i++) {
			for(int j = 0; j <= i ; j++) {
				res += lst[i][j];
			}
		}
		
		bw.write(res+"");
	
		bw.flush();
		br.close();
		bw.close();
	}

}
