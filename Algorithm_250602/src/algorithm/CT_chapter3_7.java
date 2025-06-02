// 큰 수에 2를 곱하고, 작은 수에 10을 더하라

package algorithm;

import java.io.*;

public class CT_chapter3_7 {
	
	public static int[] Func(int a, int b) {
		if(a>b) {
			a *= 2;
			b += 10;
		}
		else {
			a+=10;
			b*=2;
		}
		return new int[] {a, b};
	}
	
	
	public static void main(String[] args)throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] arr = br.readLine().split(" ");
		int a = Integer.parseInt(arr[0]);
		int b = Integer.parseInt(arr[1]);
		
		int[] result = Func(a, b);
		for(int i = 0; i < result.length; i++) {
			System.out.print(result[i] + " ");
		}
		
	}
}
