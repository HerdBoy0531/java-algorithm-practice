package algo250612;

import java.io.*;

public class Algo_13_plus_03 {

	public static void main(String[] args)throws IOException  {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		String[] arr1 = br.readLine().split(" ");
		String[] arr2 = br.readLine().split(" ");
		String[] arr3 = br.readLine().split(" ");
		
		int[] res = new int[arr1.length];
		
		for(int i = 0 ;i < arr1.length; i++) {
			int a1 = Integer.parseInt(arr1[i]);
			int a2 = Integer.parseInt(arr2[i]);
			int a3 = Integer.parseInt(arr3[i]);
			res[i] = (a1 * a2) + a3;
		}
		
		for(int i = 0 ;i < arr1.length; i++) {
			bw.write(res[i]+" ");
			
		}
		
		
		bw.flush();
		br.close();
		bw.close();
	}

}
