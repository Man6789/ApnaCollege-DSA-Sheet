package recursion;
// Print 5,4,3,2,1,1,2,3,4,5 using recursion with n=5

public class Q_PDI {

	public static void main(String[] args) {
		PDI(5);

	}//main method end
	public static void PDI(int n) {
		if(n==0) {
			return;
		}
		System.out.println(n);
		PDI(n-1);
		System.out.println(n);
		
	}//PDI end
}//Main class end
