package algo250610;

public class Algo_11_plus_06 {

	public static void main(String[] args){

		char[][] arr = new char[][] {
			{'a', 'b', 'E'},
			{'E', '2', 'W'},
			{'3', '2', '4'},			
		};
		
		for(int i  = 0; i < arr.length; i++) {
			for(int j =0; j < arr[i].length; j++) {
				int a = (int)arr[i][j];
				if(a >= 65 && a<=90) {
					System.out.print((char)(a+32)+" ");
				}
				else if(a >= 97 && a<=122) {
					System.out.print((char)(a-32)+" ");
				}
				else {
					int b = Integer.parseInt(String.valueOf(arr[i][j]));
					System.out.print((b+5)+" ");
				}
			}
			System.out.println();
		}
		
	}

}