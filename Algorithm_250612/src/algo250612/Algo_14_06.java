package algo250612;

import java.io.*;

public class Algo_14_06 {

	public static void main(String[] args)throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		String[] lst = br.readLine().split(" ");
		
		int[] arr = new int[] {3, 5, 1, 1, 2, 3, 2};
		
		
		for(int i = 0; i < lst.length; i++) {
			int cnt = 0;
			for(int j = 0; j < arr.length; j++) {
				if(Integer.parseInt(lst[i]) == arr[j]) {
					cnt+=1;
				}
			}
			bw.write(lst[i]+"="+cnt+"개\n");
		}
		
		bw.flush();
		br.close();
		bw.close();
	}

}
