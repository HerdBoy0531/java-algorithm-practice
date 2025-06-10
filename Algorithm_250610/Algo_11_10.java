package algo250610;

import java.io.*;

public class Algo_11_10 {
	
	public static int[][] arr = new int[][] {
		{3, 2, 6, 2, 4},
		{1, 4, 2, 6, 5},
		};
		
	public static int KFC(int N) {
		for(int i = 0; i < 2; i++) {
			for(int j = 0; j < 5; j++) {
				if(arr[i][j] == N) return 1;
			}
		}
		return 0;
	}
		
	
	
	public static void main(String[] args)throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int target = Integer.parseInt(br.readLine());
		int res = KFC(target);
		
		if(res == 1) bw.write("값이 존재합니다");
		else bw.write("값이 없습니다");
		
		
		bw.flush();
		br.close();
		bw.close();
	}

}