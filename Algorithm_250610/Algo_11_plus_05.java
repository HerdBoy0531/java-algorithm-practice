package algo250610;

import java.io.*;

public class Algo_11_plus_05 {

	public static void main(String[] args)throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		String[] strArr = br.readLine().split(" ");
		int cntStrArr = 0;
		int[][] arr = new int[2][3];
		for(int i = 0; i < 2; i++) {
			for(int j = 0; j < 3; j++) {
				arr[i][j] = Integer.parseInt(strArr[cntStrArr]);
				cntStrArr += 1;
			}
		}
		
		for(int i = 0; i < 2; i++) {
			for(int j = 0; j < 3; j++) {
				if(arr[i][j] == 0) {
					bw.write('#');
				}
				else bw.write(arr[i][j]+"");
			}
			bw.write("\n");
		}
		
		
		bw.flush();
		br.close();
		bw.close();
	}

}