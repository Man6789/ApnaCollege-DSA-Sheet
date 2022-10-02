package recursion;
//Return an array containing all the indices where the element occurs

public class Q_Return_Array_of_all_indices_of_Element {
	public static void main(String[] args) {
		int[] arr = {3,8,1,8,8,4};
		int[] ans = allIndices(arr, 0, 8, 0);
		for(int i=0; i<ans.length; i++) {
			System.out.print(ans[i] + " ");
		}
	}//main end

	public static int[] allIndices(int[] arr, int si, int d, int count) {
		
		if(si == arr.length) {
			int[] base = new int[count];
			return base;
		}
		
		int[] indices = null;
		if(arr[si] == d) {
			indices = allIndices(arr, si+1, d, count+1);
		}else {
			indices = allIndices(arr, si+1, d, count);
		}
		
		if(arr[si] == d) {
			indices[count] = si;
		}
		return indices;
	}//allIndices end
}//main class end
