package algo250610;

import java.io.*;

public class Algo_11_08 {

	public static void main(String[] args)throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		char ch = br.readLine().charAt(0);
		char[] arr = new char[] {'S','t','r','u','c','t','P','o','i','n','t','e','r',};
		boolean res = false;
		
		for(int i = 0; i < arr.length; i++) {
			if((int)ch == (int)arr[i]) res = true;
		}
		
		if(res) bw.write("발견");
		else bw.write("미발견");
		
		bw.flush();
		br.close();
		bw.close();
	}

}