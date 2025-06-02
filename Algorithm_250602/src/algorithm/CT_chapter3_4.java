package algorithm;

import java.io.*;

public class CT_chapter3_4 {
	public static int[] Func(int a, int b) {
		if(a>b) {
			a += 25;
			b *= 2;
		}
		else {
			a *= 2;
			b += 25;
		}
		return new int[] {a, b};
	}
	
	
	public static void main(String[] args)throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] arr = br.readLine().split(" ");
		int a = Integer.parseInt(arr[0]);
		int b = Integer.parseInt(arr[1]);
		
		int[] result = Func(a, b);
		for(int i = 0; i<2; i++){
			System.out.print(result[i]+" ");
		}
	}
}
