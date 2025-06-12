package algo250612;

import java.io.*;

public class BJ_day5_1546 {

	
	public static void main(String[] args)throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int N = Integer.parseInt(br.readLine());
		String[] nums = br.readLine().split(" ");
		float[] scores = new float[N];
		float maxScore = 0;
		for(int i = 0; i < N; i++) {
			scores[i] = Float.parseFloat(nums[i]);
			if(scores[i] > maxScore) maxScore = scores[i];
		}
		
		float totalScore = 0;
		for(int i = 0; i < N; i++) {
			
			scores[i] = (scores[i]/maxScore)*100;
			totalScore += scores[i];
		}
		
		bw.write(totalScore/N+"");
		
		br.close();
		bw.flush();
		bw.close();
	}

}
