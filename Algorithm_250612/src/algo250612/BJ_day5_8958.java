package algo250612;

import java.io.*;

public class BJ_day5_8958 {

	public static void main(String[] args)throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int tc = Integer.parseInt(br.readLine());
		for(int i = 0; i < tc; i++) {
			String arr = br.readLine();
			// 최종 점수
			int res = 0;
			// 연속된 점수 확인
			int cnt = 0;
			// 점수 계산용 for문
			for(int j = 0; j < arr.length(); j++) {
				if(arr.charAt(j) == 'O') {
					cnt += 1;
					res += cnt;
				}
				else cnt = 0;
			}
			bw.write(res+"\n");
		}
		bw.flush();
		br.close();
		bw.close();

	}

}
