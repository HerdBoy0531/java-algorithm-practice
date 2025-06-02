package algorithm;

import java.io.*;

public class CT_chapter3_3 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String A = br.readLine();
		int n = A.length()/2;
		boolean Cor = true;
		for(int i=0; i<n ;i++) {
			if(A.charAt(i) != A.charAt(A.length() - i - 1)){
				Cor = false;
				break;
			}
		}
		if(Cor) {
			System.out.printf("Yes");
		}
		else {
			System.out.printf("No");
		}
	}
}
