package algo250610;

import java.io.*;

public class Algo_11_01 {

	public static int[] INPUT()throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String[] arr = br.readLine().split(" ");
		int[] nums = new int[3];
		for(int i = 0; i < 3; i++) {
			nums[i] = Integer.parseInt(arr[i]);
		}
		return nums;
	}
	
	public static void calc(int a, int b, int c) {
		System.out.print(a+b+c);
	}
	
	public static void main(String[] args)throws IOException {
		int [] arr = INPUT();
		int a = arr[0];
		int b = arr[1];
		int c = arr[2];
		calc(a, b, c);
	}

}