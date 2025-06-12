package algo250612;

import java.io.*;

public class Algo_13_plus_08 {

	public static void main(String[] args)throws IOException  {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		String arr1 = br.readLine();
		String arr2 = br.readLine();
		String arr3 = br.readLine();
		
		boolean res = true;
		
		if(arr1.length() != arr2.length() || arr2.length() != arr3.length() ) {
			res = false;
		}
		
		else { 
			for(int i = 0; i < arr1.length(); i++) {
				if(arr1.charAt(i) != arr2.charAt(i) || arr2.charAt(i) != arr3.charAt(i)) {
					res = false;
					break;
				}
			}
			
		}
		
		if(res) bw.write("YES");
		else bw.write("NO");
		
		bw.flush();
		br.close();
		bw.close();
	}

}
