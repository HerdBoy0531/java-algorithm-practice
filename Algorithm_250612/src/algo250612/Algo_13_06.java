package algo250612;

import java.io.*;

public class Algo_13_06 {
	
	public static char[][] arr = new char[][] {
		{'A', 'D', 'F'},
		{'Q', 'W', 'E'},
		{'Z', 'X', 'C'},
	};
	
	
	public static int[] find(char A) {
		
		int y = 0;
		int x = 0;
		
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[i].length; j++) {
				if(arr[i][j] == A) {
					y=i;
					x=j;
				}
			}
		}
		int[] res =new int[]{y, x};
		return res;
		
	}

	public static void main(String[] args)throws IOException  {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		char A = br.readLine().charAt(0);
		int res[] = find(A); 
		bw.write(res[0]+","+res[1]);
		
		
		
		bw.flush();
		br.close();
		bw.close();
	}

}
