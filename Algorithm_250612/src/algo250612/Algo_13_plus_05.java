package algo250612;

import java.io.*;

public class Algo_13_plus_05 {

	public static void main(String[] args)throws IOException  {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		char[][] arr = new char[][] {
			{'4', '5', '7', '1', '3', '2'},
			{'D', 'F', 'Q', 'W', 'G', 'Z'},
		};
		int N = Integer.parseInt(br.readLine());
		
		for(int i = 0; i < arr[0].length; i++) {
			if(N == Integer.parseInt(String.valueOf(arr[0][i]))) {
				bw.write(arr[1][i]+"");
			}
		}
		
		
		
		
		bw.flush();
		br.close();
		bw.close();
	}

}
