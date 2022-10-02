package recursion;
// Print 5,3,1,2,4

public class Q_PDI_Skip {

	public static void main(String[] args) {
		PDISkip(5);

		
	}//main method end
	public static void PDISkip(int n) {
		if(n==0) {
			return;
		}
		if(n%2 != 0) {
			System.out.println(n);
			PDISkip(n-1);
		}else if(n%2 == 0) {
			PDISkip(n-1);
			System.out.println(n);
		}
		
	}
}//main class end
