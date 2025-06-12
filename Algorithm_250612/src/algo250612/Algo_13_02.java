package algo250612;

import java.io.*;

public class Algo_13_02 {
	
	public static int[] moon(int age) {
		int[] arr = new int[3];
		arr[0] = age-4;
		arr[1] = age+3;
		arr[2] = age*2;
		return arr;
	}
	

	public static void main(String[] args)throws IOException  {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int age = Integer.parseInt(br.readLine());
		int[] arr = moon(age);
		
		for(int i = 0; i < arr.length; i++) {
			bw.write(arr[i]+" ");
		}
		
		bw.flush();
		br.close();
		bw.close();
	}

}
