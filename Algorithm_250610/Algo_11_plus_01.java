package algo250610;

import java.io.*;

public class Algo_11_plus_01 {

	public static void main(String[] args)throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		String[] list = br.readLine().split(" ");
		char ch1 = list[0].charAt(0);
		char ch2 = list[1].charAt(0);
		
		char[] arr = new char[] {'D', 'F', 'G', 'D', 'A', 'Q'};
		
		boolean res = false;
		
		for(int i = 0 ; i < arr.length; i++) {
			if((int)arr[i] >= (int)ch1 && (int)arr[i] <= (int)ch2) res=true;
		}
		
		if(res) bw.write("발견!!!");
		else bw.write("미발견!!!");
		
		
		bw.flush();
		br.close();
		bw.close();
	}

}