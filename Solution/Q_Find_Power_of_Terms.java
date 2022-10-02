package recursion;
// Power(int x, int y) --> return x^y


public class Q_Find_Power_of_Terms {
	public static void main(String[] args) {
		System.out.println(Power(3,3));
		
	}//main method
	public static int Power(int x, int n) {
		if(n == 0) {
			return 1;
		}
		int ans = x*(Power(x,n-1));
		return ans;
	}
}
