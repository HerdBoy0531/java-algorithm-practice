package algo250611;

import java.io.*;

public class Algo_12_plus_01 {
	
	public static char[][] arr = new char[][] {
		{'D', 'A', 'D'},
		{'Q', 'W', 'Q'},
		{'A', 'S', 'D'},
		{'A', 'S', 'D'},
	};
	
	public static int find(char A) {
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[i].length; j++) {
				if(arr[i][j] == A) {
					System.out.printf("존재");
					return 0;
				}
			}
		}
		System.out.printf("없음");
		return 0;
	}
	
	public static void main(String[] args)throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		char A = br.readLine().charAt(0);
		int res = find(A);
		
		
		bw.flush();
		br.close();
		bw.close();
	}

}
