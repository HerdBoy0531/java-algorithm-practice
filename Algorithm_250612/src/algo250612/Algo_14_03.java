package algo250612;

import java.io.*;

public class Algo_14_03 {

	public static void main(String[] args)throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		String arr[] = br.readLine().split(" ");
		int A1 = Integer.parseInt(arr[0]);
		int A2 = Integer.parseInt(arr[1]);
		int cnt = 1;
		
		while(cnt > -1) {
			if(A1 != 100) A1++;
			if(A2 != 100) A2++;
			if(A1 == 100 && A2 == 100) break;
			cnt++;
		}
		
		bw.write(cnt+"");
	
		bw.flush();
		br.close();
		bw.close();
	}

}
