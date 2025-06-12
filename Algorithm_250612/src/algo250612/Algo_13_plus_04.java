package algo250612;

import java.io.*;

public class Algo_13_plus_04 {

	public static void main(String[] args)throws IOException  {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int[][] arr = new int[][] {
			{3, 4, 1, 6},
			{3, 5, 2, 6},
			{0, 0, 0, 0},
			{5, 4, 6, 0},
		};
		
		String[] lst = br.readLine().split(" ");
		for(int i = 0; i < 4; i++) {
			arr[2][i] = Integer.parseInt(lst[i]);
		}
		
		int max = -200000;
		int min = 200000;
		int arrMax[] = new int[] {0, 0}; 
		int arrMin[] = new int[] {0, 0}; 
		
		for(int i = 0; i < 4; i++) {
			for(int j = 0; j < 4; j++) {
				if(arr[i][j] > max) {
					max = arr[i][j];
					arrMax[0] = i;
					arrMax[1] = j;
				}
				if(arr[i][j] < min) {
					min = arr[i][j];
					arrMin[0] = i;
					arrMin[1] = j;
				}
			}
		}
		
		bw.write("Max="+max+"("+arrMax[0]+","+arrMax[1]+")\n");
		bw.write("Min="+min+"("+arrMin[0]+","+arrMin[1]+")");
		
		
		bw.flush();
		br.close();
		bw.close();
	}

}
