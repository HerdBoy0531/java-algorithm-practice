package algo250612;

import java.io.*;

public class Algo_14_01 {

	public static void main(String[] args)throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		String[] arr = br.readLine().split(" ");
		int A = Integer.parseInt(arr[0]);
		int B = Integer.parseInt(arr[1]);
		
		int cnt = A;
		while(cnt <= B) {
			bw.write(cnt+" ");
			cnt++;
		}
	
		bw.flush();
		br.close();
		bw.close();
	}

}
