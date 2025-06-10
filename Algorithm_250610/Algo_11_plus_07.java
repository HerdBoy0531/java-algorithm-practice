package algo250610;

import java.io.*;

public class Algo_11_plus_07 {
	
	public static char[][] arr = new char[][] {
		{'a', 'b', 'd'},
		{'e', 'w', 'z'},
		{'q', 'v', 'a'},
	};
	
	public static void Input() throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		char N = br.readLine().charAt(0);
		
		Process(N);
	}
	
	public static void Process(char N) {
		char n = (char)((int)N + 32);
		
		boolean res = false;
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[i].length; j++) {
				if(arr[i][j] == n) res = true;
			}
		}
		if(res) System.out.printf("존재");
		else System.out.printf("없음");
		
	}

	public static void main(String[] args)throws IOException {
		Input();
	}

}