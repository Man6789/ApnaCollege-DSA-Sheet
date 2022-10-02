package recursion;

public class Recursion_Stack_Falling {

	public static void main(String[] args) {
		PI(5);
		
		
	}//main method end
	public static void PI(int n) {
		if(n==0) {
			return;
		}
		PI(n-1);
		System.out.println(n);
	}
	
}//main class end
