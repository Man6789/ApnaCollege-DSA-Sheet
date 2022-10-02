package recursion;
//Find the first index of the element in the array with the starting index 0 using recursion.

public class Q_Find_First_Index_of_Element {

	public static void main(String[] args) {
		int[] arr = {0,1,2,8,8,7,5};
		System.out.println(first_index(arr, 0, 8));
		

	}//main end
	
	public static int first_index(int[] arr, int si, int d) {
		if(si == arr.length) {
			return -1;
		}
		
		if (arr[si] == d) {
			return si;
		}else {
			return first_index(arr, si+1, d);
		}
		
		
	}

}
