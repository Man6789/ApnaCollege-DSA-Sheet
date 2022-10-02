package recursion;

public class Q9_Printing_Pattern {
	public static void main(String[] args) {
		pattern(5,1,1);
		
		
	}//main method
	
	public static void pattern(int n, int row, int col) {
		if(row > n) {
			return;
		}
		if(col > row) {
			System.out.println();
			pattern(n, row+1, 1);
			return;
		}
		
		System.out.print("* ");
		pattern(n, row, col+1);
		
	}//pattern end

}//main class
