package algo250612;

import java.io.*;

public class Algo_13_08 {
	
	public static void CompareGo(int[] arr1, int[] arr2)throws IOException {
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		boolean res = true;
		for(int i = 0; i < 5; i++) {
			if(arr1[i] != arr2[i]) {
				res = false;
				break;
			}
		}
		
		if(res) bw.write("두배열은완전같음");
		else bw.write("두배열은같지않음");
		
		
		bw.flush();
		bw.close();
	}

	public static void main(String[] args)throws IOException  {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int[] arr1 = new int[] {3, 5, 1, 2, 7};
		int[] arr2 = new int[5];
		String[] lst = br.readLine().split(" ");
		for(int i = 0; i < lst.length; i++) {
			arr2[i] = Integer.parseInt(lst[i]);
		}
		CompareGo(arr1, arr2);
		
		
		

		br.close();

	}

}
