package algo250612;

import java.io.*;
import java.util.*;

public class Algo_13_plus_02 {

	public static void main(String[] args)throws IOException  {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		String[] arr = br.readLine().split(" ");
		int[] len = new int[] {4, 2, 5, 1, 6, 7, 3};
		
		// 알파벳 정렬
		Arrays.sort(arr);
		int st = (int)arr[0].charAt(0) - 65;
		int ed = (int)arr[1].charAt(0) - 65;
		int res = 0;
		
		for(int i = st ; i < ed; i++) {
			res += i;
		}
		
		bw.write(res+"");
		
		bw.flush();
		br.close();
		bw.close();
	}

}
