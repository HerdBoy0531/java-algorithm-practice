package algo250610;

public class Algo_10_plus_01 {

	public static void main(String[] args) {
		int[][] arr = new int[4][4];
		
		int cnt = 1;
		
		for(int i = 0; i < 4 ; i++) {
			for(int j = 0; j < 4; j++) {
				arr[j][i] = cnt*2;
				cnt += 1;
			}
		}
		
		for(int i = 0; i < 4 ; i++) {
			for(int j = 0; j < 4; j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
		
	}
}
