package algo250612;

import java.io.*;

public class BJ_day5_2884 {

	public static void main(String[] args)throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		String[] arr = br.readLine().split(" ");
		int H = Integer.parseInt(arr[0]);
		int M = Integer.parseInt(arr[1]);
		
		if(M>45) M -= 45;
		else {
			M += 15;
			if(H == 0) H = 23;
			else H -= 1;
		}
		
		bw.write(H+" "+M);
		
		bw.flush();
		br.close();
		bw.close();
	}

}
