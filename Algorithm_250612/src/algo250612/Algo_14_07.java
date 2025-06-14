package algo250612;

import java.io.*;
import java.util.*;

public class Algo_14_07 {

	public static void main(String[] args)throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String[] arr = br.readLine().split(" ");
		
		Arrays.sort(arr, Collections.reverseOrder());
		
		for(int i = 0; i < arr.length; i++) {
			bw.write(arr[i]);
		}
		bw.flush();
		br.close();
		bw.close();
	}

}
