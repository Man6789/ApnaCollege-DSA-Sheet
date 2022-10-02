package recursion;
// Print 5,4,3,2,1 using recursion 


public class Recursion_Stack_Building {

	public static void main(String[] args) {
		PD(5);		
	}//main method end
	
	public static void PD(int n) {
		if (n==0) {
			return;
		}
		System.out.println(n);
		PD(n-1);
	}
	
}//main class end
