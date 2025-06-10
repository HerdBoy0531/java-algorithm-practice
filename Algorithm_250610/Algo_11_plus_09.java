package algo250610;

import java.io.*;

public class Algo_11_plus_09 {

	public static void main(String[] args)throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		String[] strArr = br.readLine().split(" ");
		int cntStrArr = strArr.length - 1;
		
		int[][] arr1 = new int[2][3];
		
		int[] arr2 = new int[6];
		int cntArr2 = 0;
		
		for(int i = 0; i < 2; i++) {
			for(int j = 0 ; j < 3; j++) {
				arr1[i][j] = Integer.parseInt(strArr[cntStrArr]);
				cntStrArr -= 1;
			}
		}
		
		for(int i = 0; i < 2; i++) {
			for(int j = 0 ; j < 3; j++) {
				arr2[cntArr2] = arr1[i][j];
				cntArr2 += 1;
			}
		}
		
		int swap = arr2[0];
		arr2[0] = arr2[arr2.length-1];
		arr2[arr2.length-1] = swap;
		
		for(int i = 0; i < 6; i++) {
			bw.write(arr2[i]+" ");
		}
		
		
		bw.flush();
		br.close();
		bw.close();
	}

}