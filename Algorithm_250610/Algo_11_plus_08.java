package algo250610;

import java.io.*;

public class Algo_11_plus_08 {

	public static void main(String[] args)throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int[][] arr = new int[][] {
			{3, 1, 6},
			{7, 8, 4},
			{9, 2, 3},
		};
		
		String[] nums = br.readLine().split(" ");
		int a = Integer.parseInt(nums[0]);
		int b = Integer.parseInt(nums[1]);
		int c = Integer.parseInt(nums[2]);
		
		arr[a][b] = c;
		
		int maxNum = -200000;
		int minNum = 200000;
		
		for(int i = 0; i < arr.length ; i++) {
			for(int j = 0; j<arr[i].length; j++) {
				if(arr[i][j] > maxNum) maxNum = arr[i][j];
				if(arr[i][j] < minNum) minNum = arr[i][j];
			}
		}
		
		bw.write((maxNum + minNum)+"");
		
		bw.flush();
		br.close();
		bw.close();
	}

}