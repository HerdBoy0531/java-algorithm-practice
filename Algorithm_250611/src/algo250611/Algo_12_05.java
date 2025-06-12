package algo250611;

import java.io.*;

public class Algo_12_05 {

	public static void main(String[] args)throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int N = Integer.parseInt(br.readLine());
		int[][] arr = new int[3][4];
		int cnt = 0;
		
		for(int i = 0; i < 3 ; i++) {
			for(int j = 2 ; j < 4+i; j++) {
				arr[i][j-i] = (char)(N+cnt);
				cnt++;
			}
		}
		
		for(int i = 0; i < 3 ; i++) {
			for(int j = 0 ; j < 4; j++) {
				if(arr[i][j] == 0) bw.write(" ");
				else bw.write(arr[i][j]+"");
			}
			bw.write("\n");
		}
		
		
		bw.flush();
		br.close();
		bw.close();
	}

}
