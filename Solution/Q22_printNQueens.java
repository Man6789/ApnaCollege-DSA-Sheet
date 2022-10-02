package recursion;

public class Q22_printNQueens {
	public static void main(String[] args) {
		
		boolean board[][] = new boolean[4][4];
		printNQueens(board, 0, "");
		
		
	}//main end
	
	public static void printNQueens(boolean[][] board, int row, String res) {
		if(row == board.length) {
			System.out.println(res);
			return; 
		}
		
		for(int col=0; col < board[row].length; col++) {
			if(isItSafe(board, row, col)) {
				board[row][col] = true;
				printNQueens(board, row+1, res + "{" + (row+1) + "-" + (col+1) + "}");
				board[row][col] = false;
			}
		}
	}//countNQueens end
	
	private static boolean isItSafe(boolean board[][], int row, int col) {
		
		for(int i=row; i>=0; i--) {
			if(board[i][col]) {
				return false;
			}
		}//for loop 1 end
		for(int i=row, j=col; i>=0 && j>=0; i--, j--) {
			if(board[i][j]) {
				return false;
			}
		}//for loop 2 end
		for(int i=row, j=col; i>=0 && j<board.length; i--, j++) {
			if(board[i][j]) {
				return false;
			}
		}//for loop 3 end
		return true;
		
	}

}
