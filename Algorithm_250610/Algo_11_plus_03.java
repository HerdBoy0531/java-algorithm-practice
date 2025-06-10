package algo250610;

import java.io.*;

public class Algo_11_plus_03 {

	public static void main(String[] args)throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		char[] arr = new char[] {'A', '1', '1', '1', '5', 'A', 'w', 'z'};
		
		char N = br.readLine().charAt(0);
		
		int cnt = 0;
		for(int i = 0; i < arr.length; i++) {
			if(N == arr[i]) {
				cnt += 1;
			}
		}
		
		if(cnt >= 3) bw.write("THREE");
		else if(cnt == 2) bw.write("TWO");
		else if(cnt == 1) bw.write("ONE");
		else bw.write("NOTHING");
		
		bw.flush();
		br.close();
		bw.close();
	}

}