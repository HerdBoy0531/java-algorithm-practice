package algo250611;

import java.io.*;

public class Algo_12_plus_05 {

	public static void main(String[] args)throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int[][] arr = new int[][] {
			{4, 5, 4, 5, 4},
			{8, 9, 8, 9, 8},
			{1, 2, 1, 2, 1},
			{4, 5, 4, 5, 4},
			{6, 7, 6, 7, 6},
		};
		for(int i = 0; i < 5; i++) {
			String[] nums = br.readLine().split(" ");
			int a = Integer.parseInt(nums[0]);
			int b = Integer.parseInt(nums[1]);
			arr[a][b] += 1;
		}
		
		for(int i = 0; i < 5; i++) {
			for(int j = 0; j < 5; j++) {
				if(arr[i][j] >= 10) bw.write((arr[i][j]-10)+"");
				else bw.write(arr[i][j]+"");
			}
			bw.write("\n");
		}
		
		bw.flush();
		br.close();
		bw.close();
	}

}
