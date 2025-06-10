package algo250610;

import java.io.*;

public class Algo_10_plus_10 {

	public static int[][] arr = new int[][] {
		{1, 0, 0, 0, 0},
		{1, 0, 1, 0, 0},
		{1, 1, 0, 1, 0},
		{1, 0, 1, 0, 0},
		{0, 1, 0, 0, 1},
		{0, 0, 0, 1, 0},
		{1, 1, 0, 0, 0},
	};
	
	public static int INPUT()throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		return N;
	}
	
	public static int PROCESS(int N) {
		int cnt = 0;
		for(int i = 0; i < 7; i++) {
			if(arr[i][N] == 1) {
				cnt += 1;
			}
		}
		return cnt;
	}
	public static void OUTPUT(int res){
		System.out.print(res);
	}
	
	public static void main(String[] args)throws IOException {
		int N = INPUT();
		int res = PROCESS(N);
		OUTPUT(res);
	}

}
