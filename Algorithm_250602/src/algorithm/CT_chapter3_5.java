package algorithm;

import java.io.*;

public class CT_chapter3_5 {
	//절대값 만들어서 출력하는 함수
	public static void absolute(int a) {
		if(a < 0 ) {
			a *= -1;
		}
		System.out.print(a + " ");
	}
	
	
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		String[] strArr = br.readLine().split(" ");
		int[] intArr = new int[N];
		// 입력 받은 값 int로 변환
		for(int i = 0 ; i<N; i++) {
			intArr[i] = Integer.parseInt(strArr[i]);
			absolute(intArr[i]);
		}
		
		
	}
}
