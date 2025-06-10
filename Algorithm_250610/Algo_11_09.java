package algo250610;

import java.io.*;
import java.util.*;

public class Algo_11_09 {

	public static void main(String[] args)throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		String[] strArr = br.readLine().split(" ");
		char[] arr = new char[8];
		for(int i = 0; i < 8; i++) {
			arr[i] = strArr[i].charAt(0);
		}
		
		ArrayList<Character> small = new ArrayList<>();
		ArrayList<Character> big = new ArrayList<>();
		
		for(int i = 0; i < 8; i++) {
			if((int)arr[i] >= 65 && (int)arr[i] <= 90) {
				big.add(arr[i]);
			}
			else {
				small.add(arr[i]);
			}
		}
		
		StringBuilder sbSmall = new StringBuilder();
		for (char ch : small) {
			sbSmall.append(ch);
		}
		String resSmall=sbSmall.toString();
		
		StringBuilder sbBig = new StringBuilder();
		for (char ch : big) {
			sbBig.append(ch);
		}
		String resBig=sbBig.toString();

		bw.write("big="+resBig+"\n");
		bw.write("small="+resSmall);
		
		
		bw.flush();
		br.close();
		bw.close();
	}

}