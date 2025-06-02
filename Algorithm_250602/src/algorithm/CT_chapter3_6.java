// 서로 다른 알파벳이 2개 이상 있으면 Yes / 전부 같은 알파벳이면 No

package algorithm;

import java.io.*;

public class CT_chapter3_6 {
	public static Integer Func(String Alpha) {
		int count = 0;
		int len = Alpha.length();
		for(int i = 0; i<len-1; i++) {
			if(count>=1) break;
			for(int j = i+1; j<len;j++) {
				if(Alpha.charAt(i) != Alpha.charAt(j)) {
					count += 1;
				}
			}
		}
		return count;
	}

	public static void main(String[] args)throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String A = br.readLine();
		int result = Func(A);
		if(result>=1) {
			System.out.print("Yes");
		}
		else {
			System.out.print("No");
		}
		
	}
}
