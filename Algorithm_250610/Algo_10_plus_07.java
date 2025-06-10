package algo250610;

import java.io.*;

public class Algo_10_plus_07 {

	public static char aToz()throws IOException  {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		char A = br.readLine().charAt(0);
		
		int res = (int)A - 65;
		
		if(res > 12) return 'Z';
		else return 'A';
		
	}
	
	
	
	public static void main(String[] args)throws IOException {

		char res = aToz();
		System.out.print(res);

	}

}
