package recursion;
// Check if the array is sorted or not using recursion.

public class Q_Check_If_Array_is_Sorted {
	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5};
		System.out.println(sorted(arr, 0));
	}//main end
	
	public static boolean sorted(int[] arr, int si) {
		if (arr.length-1 == si) {
			return true;
		}
		if (arr[si] > arr[si+1]) {
			return false;
		}else {
			boolean resta = sorted(arr, si+1);
			return resta;
		}
		
		
	}

}//main class end
