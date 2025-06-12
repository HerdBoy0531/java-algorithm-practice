package algo250611;

import java.io.*;

public class Algo_12_04 {

	public static void main(String[] args)throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int N = Integer.parseInt(br.readLine());
		
		for(int i = 0; i < N; i++) {
			for(int j = 1; j < 4; j++) {
				bw.write(j+"");
			}
			bw.write("\n");
		}
		
		
		
		bw.flush();
		br.close();
		bw.close();
	}

}
