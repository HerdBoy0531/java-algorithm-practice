package algo250610;

import java.io.*;

public class Algo_11_07 {

	public static void main(String[] args)throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String[] arr = br.readLine().split(" ");
		int[] numArr = new int[7];
		for(int i = 0; i < arr.length; i++) {
			numArr[i] = Integer.parseInt(arr[i]);
		}
		
		int maxNum = -20000000;
		int minNum = 2000000;
		
		for(int i = 0; i < numArr.length; i++) {
			if(numArr[i] > maxNum) {
				maxNum = numArr[i];
			}
			if(numArr[i] < minNum) {
				minNum = numArr[i];
			}
		}
		
		bw.write("MAX="+maxNum+"\n");
		bw.write("MIN="+minNum);
		
		bw.flush();
		br.close();
		bw.close();
	}

}