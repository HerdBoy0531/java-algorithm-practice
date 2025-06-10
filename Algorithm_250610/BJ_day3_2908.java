package algo250610;

import java.io.*;

public class BJ_day3_2908 {

	public static void main(String[] args)throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String[] arr = br.readLine().split(" ");
		String A = arr[0];
		String B = arr[1];
		
		int a = Integer.parseInt(new StringBuilder(A).reverse().toString());
		int b = Integer.parseInt(new StringBuilder(B).reverse().toString());
		
		if(a > b) {
			bw.write(a+"\n");
		}
		else{
			bw.write(b+"\n");
		}
		
		
		bw.flush();
		br.close();
		bw.close();
	}

}
