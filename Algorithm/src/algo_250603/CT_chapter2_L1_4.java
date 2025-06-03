package algo_250603;

public class CT_chapter2_L1_4 {

	public static void f(int a[], int t, int l) {  
	    if (t >= l)  
	        return;  
	    System.out.print(a[t] + " ");
	    f(a, t + 1, l);  
	    System.out.print(a[t] + " ");
	}
	public static void main(String[] args) {
	    int[] a = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 0};
	    int n, i;
	    n = 10;
	    f(a, 0, n);
	}


}

