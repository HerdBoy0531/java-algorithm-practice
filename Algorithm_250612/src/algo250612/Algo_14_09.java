package algo250612;

import java.io.*;

public class Algo_14_09 {

	public static void main(String[] args)throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int[] arr = new int[] {10, 50, 40, 20, 30, 40};
		int[] lst = new int[6];
		String[] lstStr = br.readLine().split(" ");
	
		
		for(int i = 0; i < lstStr.length; i++) {
			int cnt = 0;
			for(int j = 0; j < arr.length; j ++) {
				if(Integer.parseInt(lstStr[i]) <= arr[j]) {
					cnt+=1;
				}
			}
			bw.write(lstStr[i]+"="+cnt+"개\n");
		}
		
		bw.flush();
		br.close();
		bw.close();
	}

}
