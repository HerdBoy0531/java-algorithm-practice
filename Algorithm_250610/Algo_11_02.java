package algo250610;

import java.io.*;

public class Algo_11_02 {

	public static int sum(int a, int b) {
		return a+b;
	}
	
	public static int comp(int a, int b) {
		return a-b;
	}
	
	public static void print(int a, int b) {
		System.out.printf("합:%d\n차:%d", a, b);
	}
	
	
	public static void main(String[] args)throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		String[] arr = br.readLine().split(" ");
		int a = Integer.parseInt(arr[0]);
		int b = Integer.parseInt(arr[1]);
		
		int resSum = sum(a, b);
		int resComp = comp(a, b);
		print(resSum, resComp);
		
		
		bw.flush();
		br.close();
		bw.close();
	}

}