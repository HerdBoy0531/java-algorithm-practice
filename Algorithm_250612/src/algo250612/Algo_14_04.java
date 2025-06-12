package algo250612;

import java.io.*;

public class Algo_14_04 {

	public static void main(String[] args)throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		String[] arr = br.readLine().split(" ");
		for(int i = 0; i < arr.length; i++) {
			for(int j = i; j < arr.length; j++) {
				bw.write(arr[j]+" ");
			}
			bw.write("\n");
		}
		
	
		bw.flush();
		br.close();
		bw.close();
	}

}
