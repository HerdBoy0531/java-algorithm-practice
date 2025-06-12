package algo250612;

import java.io.*;

public class Algo_13_05 {

	public static int[] KFC()throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String arr = br.readLine();
		int small = 0;
		int big = 0;
		
		for(int i = 0; i < arr.length(); i++) {
			if(arr.charAt(i) >= 'A' && arr.charAt(i)  <= 'Z') {
				big++;
			}
			else small++;
		}
		int[] res = new int[] {big, small};
		
		return res;
		
	}
	
	public static void main(String[] args)throws IOException  {

		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int[] arr = KFC();
		
		bw.write("대문자"+arr[0]+"개\n"+"소문자"+arr[1]+"개");
		
		
		bw.flush();
		bw.close();
	}

}
