package algo250611;

import java.io.*;

public class Algo_12_10 {

	public static void main(String[] args)throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		String[] arr = br.readLine().split(" ");
		int a = Integer.parseInt(arr[0]);
		char N = arr[1].charAt(0);
		char[][] res = new char[5][5];
		int cnt = 0;
		
		for(int i = 0; i < 5; i++) {
			for(int j = 0; j < 5; j++) {
				if(i==(a-1)) {
					res[a-1][4-j] = (char)((int)N+cnt);
					cnt++;
				}
				else res[i][j] = '0';
			}
		}

		
		for(int i = 0; i < 5; i++) {
			for(int j = 0; j < 5; j++) {
				bw.write(res[i][j]+"");
			}
			bw.write("\n");
		}
		
		bw.flush();
		br.close();
		bw.close();
	}

}
