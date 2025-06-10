package algo250610;

import java.io.*;

public class Algo_10_plus_08 {
	
	public static char Calculator()throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int score = Integer.parseInt(br.readLine());
		
		if(score >= 90) return 'A';
		else if(score >= 80) return 'B';
		else if(score >= 70) return 'C';
		else return 'D';
	}

	public static void main(String[] args)throws IOException {
		char res = Calculator();
		System.out.print(res);
	}

}
