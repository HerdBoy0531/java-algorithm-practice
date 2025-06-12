package algo250612;

import java.io.*;
import java.util.*;

public class Algo_13_01 {

	public static String[] getName()throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String[] arr = br.readLine().split(" ");
		
		return arr;
		
	}
	
	
	public static void main(String[] args)throws IOException  {
		
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		String[] arr = getName();
				
		Arrays.sort(arr);
		
		bw.write(arr[0]);
		
		
		
		bw.flush();
		bw.close();
	}

}
