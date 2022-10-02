package recursion;

public class Q_N_Factorial {
	public static void main(String[] args) {
		System.out.println(fact(4));
	}//main method
	
	public static int fact(int n) {
		if (n==1) {
			return 1;
		}
		int fm1 = fact(n-1);
		int fct = n * fm1;
		return fct;
	}
}//main class
