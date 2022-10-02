package recursion;

public class Q_Nth_Fibonacci_Term {
	public static void main(String[] args) {
		System.out.println(fib(6));
	}//main method
	
	public static int fib(int n) {
		if(n == 0 || n == 1) {
			return n;
		}
		int fbm1 = (fib(n-1));
		int fbm2 = (fib(n-2));
		int fb = fbm1 + fbm2;
		return fb;
	}//fib end

}//main class end
