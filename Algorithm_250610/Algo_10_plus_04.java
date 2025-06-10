package algo250610;

import java.io.*;

public class Algo_10_plus_04 {
	public static int[][] arr = new int[][] {
		{'D', 'A', 'C', 'C', 'D'},
		{'S', 'D', 'F', 'A', 'E'},
		{'E', 'E', 'T', 'J', 'H'},
	} ;
	
	public static int CHECK(char N) {
		for(int i = 0; i < 3; i++) {
			for(int j = 0; j<5; j++) {
				if(N == arr[i][j]) {
					return 1;
				}
			}
		}
		return 0;
	}
	
	public static void INPUT() throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		char N = br.readLine().charAt(0);
		
		int res = CHECK(N);
		
		if(res==1)System.out.printf("있음");
		else System.out.printf("없음");
		
		bw.flush();
		br.close();
		bw.close();
	}
	

	public static void main(String[] args)throws IOException {
		INPUT();
	}

}
