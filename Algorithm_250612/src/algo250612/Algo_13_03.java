package algo250612;

import java.io.*;

public class Algo_13_03 {
	
	public static int stringLen(String arr) {
		return arr.length();
	}
	
	
	public static void main(String[] args)throws IOException  {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String arr = br.readLine();
		
		int res = stringLen(arr);
		
		bw.write(res+"글자");
		
		
		
		bw.flush();
		br.close();
		bw.close();
	}

}
