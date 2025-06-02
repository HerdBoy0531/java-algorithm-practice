package algorithm;

import java.io.*;

public class CT_chapter3_1 {
	
	public static int[] Swap(int a, int b) {
		return new int[] {b,a};
	}
	
	
	
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] arr = br.readLine().split(" ");
		int n = Integer.parseInt(arr[0]);
		int m = Integer.parseInt(arr[1]);
		
		int[] result  = Swap(n, m);
		n = result[0];
		m = result[1];
		
		System.out.print(n);
		System.out.print(" "+m);
		
	}
}
