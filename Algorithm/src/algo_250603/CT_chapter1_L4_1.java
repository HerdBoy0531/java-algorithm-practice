package algo_250603;

//import java.io.*;
//
//public class CT_chapter1_L4_1 {
//	
//	public static boolean Func(String longArr, String shortArr, int N) {
//		int count = 1;
//		for(int i = 1; i<shortArr.length();i++) {
//			if(i+N>=longArr.length()) continue;
//			if(longArr.charAt(N+i) == shortArr.charAt(i)) {
//				count+=1;
//			}
//		}
//		if(count == shortArr.length()) {
//			return true;
//		}
//		else return false;
//	}
//	
//
//	public static void main(String[] args) throws IOException{
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		String longArr = br.readLine();
//		String shortArr = br.readLine();
//		int loc = 0;
//		boolean res = false;
//		
//		
//		for(int i=0 ; i<longArr.length();i++) {
//			if(longArr.charAt(i) == shortArr.charAt(0)) {
//				loc = i;
//				res = Func(longArr, shortArr, i);
//			}
//		}
//		if(res) {
//			System.out.print(loc);
//		}
//		else {
//			System.out.print(-1);
//		}
//
//	}
//
//}


import java.io.*;

public class CT_chapter1_L4_1 {

    public static boolean Func(String longArr, String shortArr, int N) {
        // shortArr 길이만큼 범위 초과 검사
        if (N + shortArr.length() > longArr.length()) return false;

        for (int i = 0; i < shortArr.length(); i++) {
            if (longArr.charAt(N + i) != shortArr.charAt(i)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String longArr = br.readLine();
        String shortArr = br.readLine();
        int loc = -1;

        for (int i = 0; i <= longArr.length() - shortArr.length(); i++) {
            if (Func(longArr, shortArr, i)) {
                loc = i;
                break;
            }
        }

        System.out.println(loc);
    }
}
