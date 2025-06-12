package algo250612;

import java.io.*;

public class BJ_day6_2753 {

	public static void main(String[] args)throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int N = Integer.parseInt(br.readLine());
		
		if(N%4==0) {
			if(N%100==0 && N%400!=0) {
				bw.write('0');
			}
			else bw.write('1');
		}
		else bw.write('0');
		
		
		bw.flush();
		br.close();
		bw.close();
	}

}
