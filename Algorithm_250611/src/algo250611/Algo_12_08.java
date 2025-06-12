package algo250611;

import java.io.*;

public class Algo_12_08 {

	public static void main(String[] args)throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		char[] arr = new char[] {'D', 'A', 'T', 'A', 'P', 'O', 'W', 'E', 'R'};
		
		
		String[] nums = br.readLine().split(" ");
		int a = Integer.parseInt(nums[0]);
		int b = Integer.parseInt(nums[1]);
		int cnt = 0;
		char[] resArr = new char[b-a+1];
		
		for(int i = a; i <= b; i++) {
			resArr[cnt] = arr[i];
			cnt += 1;
		}
		
		bw.write(new String(resArr)); 
		
		
		bw.flush();
		br.close();
		bw.close();
	}

}
