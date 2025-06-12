package algo250611;

import java.io.*;

public class Algo_12_03 {

	public static void main(String[] args)throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int N = Integer.parseInt(br.readLine());
		
		for(int i = 0; i < 4; i++) {
			for(int j = 0; j<4; j++) {
				bw.write(N-i+"");
			}
			bw.write("\n");
		}
		
		
		
		bw.flush();
		br.close();
		bw.close();
	}

}
