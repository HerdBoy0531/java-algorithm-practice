package algorithm;

import java.io.*;

public class Algo_10_2 {
	public static int[][] Even(int[][] arr) {
		for(int i = 0;i<4;i++) {
			arr[i][i] = i+1;
		}
		return arr;
	}

	public static int[][] Odd(int[][] arr) {
		int len = arr.length;
		for(int i = 4;i>0;i--) {
			arr[len-i][i-1] = 5-i;
		}
		return arr;
	}
	
	
	public static void main(String[] args)throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int a = Integer.parseInt(br.readLine());
		int[][] arr = new int[4][4]; 
		if(a%2==0) {
			arr = Even(arr);
		}
		else {
			arr = Odd(arr);
		}
		
		for(int i = 0; i<4; i++) {
			for(int j = 0; j<4; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
	}
	
}
