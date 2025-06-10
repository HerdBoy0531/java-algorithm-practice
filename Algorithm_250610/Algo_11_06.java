package algo250610;

import java.io.*;

public class Algo_11_06 {

	public static void main(String[] args)throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int N = Integer.parseInt(br.readLine());
		
		boolean flag = false;
		
		int[] arr = new int[] {3, 4, 1, 3, 2, 7, 3};
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] == N) flag = true;
		}
		
		if(flag) bw.write("발견");
		else bw.write("미발견");
		
		bw.flush();
		br.close();
		bw.close();
	}

}