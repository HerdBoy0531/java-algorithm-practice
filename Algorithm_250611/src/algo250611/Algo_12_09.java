package algo250611;

import java.io.*;

public class Algo_12_09 {

	public static void main(String[] args)throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		char N = br.readLine().charAt(0);
		int[][] arr = new int[3][3];
		int cnt = 6;
		int cnt1 = 1;
		
		if((int)N >= 65 && (int)N <=90) {
			for(int i = 0; i < 3; i++) {
				for(int j = i; j < 3; j++) {
					arr[i][j] = cnt;
					cnt--;
				}
			}
		}
		
		if((int)N >= 65 && (int)N <=90) {
			for(int i = 0; i < 3; i++) {
				for(int j = i; j < 3; j++) {
					arr[i][j] = cnt;
					cnt--;
				}
			}
		}
		
		else {
			for(int i = 2; i > -1; i--) {
				for(int j = 0; j <=i ; j++) {
					arr[i][j] = cnt1;
					cnt1++;
				}
			}
		}
		
		for(int i = 0; i < 3; i++) {
			for(int j = 0; j < 3; j++) {
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
