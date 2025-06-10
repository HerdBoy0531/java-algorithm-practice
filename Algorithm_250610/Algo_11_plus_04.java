package algo250610;

import java.io.*;

public class Algo_11_plus_04 {

	public static void main(String[] args)throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		char[][] arr = new char[][] {
			{'a','b','a','c','z'},
			{'c','t','a','c','d'},
			{'c','c','c','c','a'},
		};
		
		char N = br.readLine().charAt(0);
		
		int cnt = 0;
		
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[i].length; j++) {
				if(arr[i][j] == N) {
					cnt += 1;
				}
			}
		}
		
		if(cnt>=7) bw.write("세상에");
		else if(cnt>=5) bw.write("와우");
		else if(cnt>=3) bw.write("이야");
		else bw.write("이런");
		
		
		bw.flush();
		br.close();
		bw.close();
	}

}