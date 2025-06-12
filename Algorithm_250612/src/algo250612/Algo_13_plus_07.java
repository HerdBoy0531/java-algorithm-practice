package algo250612;

import java.io.*;

public class Algo_13_plus_07 {

	public static void Find(String[] arr1, String[] arr2, char[][] arr)throws IOException {
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		bw.write(arr[Integer.parseInt(arr1[0])][Integer.parseInt(arr1[1])]+" ");
		bw.write(arr[Integer.parseInt(arr2[0])][Integer.parseInt(arr2[1])]+"");
		
		
		bw.flush();
		bw.close();
	}
	
	
	public static void main(String[] args)throws IOException  {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		char[][] arr = new char[][] {
			{'D', 'A', 'S'},
			{'Q', 'W', 'V'},
			{'R', 'T', 'Y'},
		};
		String[] arr1 = br.readLine().split(" ");
		String[] arr2 = br.readLine().split(" ");
		Find(arr1, arr2, arr);
		
		br.close();
	}

}
