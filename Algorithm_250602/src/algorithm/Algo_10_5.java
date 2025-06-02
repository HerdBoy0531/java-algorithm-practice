package algorithm;

import java.io.*;

public class Algo_10_5 {
	
	public static int[][] One() {
		int[][] arr = new int[3][3];
		int count = 1;
		for(int i = 2; i>=0; i--) {
			for(int j = 2; j>=0; j--) {
				arr[j][i] = count;
				count += 1;
			}
		}
		return arr;
	}
	
	public static int[][] Two() {
		int[][] arr = new int[3][3];
		int count = 1;
		for(int i = 2; i>=0; i--) {
			for(int j = 0; j<3; j++) {
				arr[i][j] = count;
				count += 1;
			}
		}
		return arr;
	}
	
	public static int[][] Three() {
		int[][] arr = new int[3][3];
		int count = 10;
		for(int i = 0; i<3; i++) {
			for(int j = 0; j<3; j++) {
				arr[j][i] = count;
				count += 1;
			}
		}
		return arr;
	}
	

	public static void main(String[] args)throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int num = Integer.parseInt(br.readLine());
		int[][] arr;
		if(num%5==1) {
			arr = One();
		}
		else if(num%5==2) {
			arr = Two();
		}
		else {
			arr = Three();
		}
		for(int i = 0; i<3;i++) {
			for(int j = 0 ; j < 3; j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
	}
}
