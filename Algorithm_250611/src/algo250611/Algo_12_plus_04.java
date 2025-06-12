package algo250611;

import java.io.*;

public class Algo_12_plus_04 {

	public static void main(String[] args)throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		char[][] arr = new char[5][5];
		int N = Integer.parseInt(br.readLine());
		for(int i = 0; i < 5; i++) {
			for(int j = 0; j < 5; j++) {
				if(i >= 1 && i <= 3 && j >= 1 && j <= 3) {
					arr[i][j] = '_';
				}
				else arr[i][j] = String.valueOf(N).charAt(0);
			}
		}
		
		for(int i = 0; i < 5; i++) {
			for(int j = 0; j < 5; j++) {
				bw.write(arr[i][j]);
			}
			bw.write("\n");
		}
		
		
		
		bw.flush();
		br.close();
		bw.close();
	}

}
