package algorithm;

import java.io.*;

public class Algo_10_4 {
	
	public static char getChar()throws IOException{
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	String[] arr = br.readLine().split(" ");
	char C1 = arr[0].charAt(0);
	char C2 = arr[1].charAt(0);
	if (C1 > C2) {
		return C1;
	}
	else {
		return C2;
	}
	}
	
	public static void main(String[] args)throws IOException{
		char result = getChar();
		System.out.print(result);
		
	}
}
