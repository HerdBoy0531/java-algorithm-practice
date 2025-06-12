package algo250611;

import java.io.*;

public class Algo_12_01 {

	public static void main(String[] args)throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		String arr = br.readLine();
		
		for(int i = 0; i < 5; i++) bw.write(arr+"\n");
		
		
		bw.flush();
		br.close();
		bw.close();
	}

}
