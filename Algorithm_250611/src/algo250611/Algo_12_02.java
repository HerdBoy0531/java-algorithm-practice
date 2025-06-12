package algo250611;

import java.io.*;

public class Algo_12_02 {

	public static void main(String[] args)throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		String arr1 = br.readLine();
		String arr2 = br.readLine();
		
		bw.write(arr1.length()+" "+arr2.length());
		
		
		
		bw.flush();
		br.close();
		bw.close();
	}

}
