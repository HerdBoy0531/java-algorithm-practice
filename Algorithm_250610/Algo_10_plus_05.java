package algo250610;

import java.io.*;

public class Algo_10_plus_05 {

	public static void main(String[] args)throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		String[] arr = br.readLine().split(" ");
		
		int a = Integer.parseInt(arr[0]);
		int b = Integer.parseInt(arr[1]);
		int c = Integer.parseInt(arr[2]);
		
		int[][] nums = new int[3][4];
		
		for(int i = 0; i < 3; i++) {
			int cnt = 0;
			for(int j = 0; j<4; j++) {
				if(i==0) nums[i][j] = cnt + a; 
				else if(i==1) nums[i][j] = cnt + b; 
				else if(i==2) nums[i][j] = cnt + c; 
				cnt+=1;
			}
		}
		
		for(int i = 0; i < 3; i++) {
			for(int j = 0; j<4; j++) {
				System.out.print(nums[i][j]+" ");
			}
			System.out.println();
		}
		
		
		
		bw.flush();
		br.close();
		bw.close();
	}

}
