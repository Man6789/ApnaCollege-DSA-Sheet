package recursion;
//Find the last index of an element using recursion with starting index = 0, i.e., without back traversing.

public class Q_Find_Last_Index_of_Element_Without_reverse_traversing {
	public static void main(String[] args) {
		int[] arr = {0,1,2,8,8,7,5};
		System.out.println(lastIndex(arr, 0, 8));
	}//main end
	
	public static int lastIndex(int[] arr, int si, int d) {
		if(si == arr.length) {
			return -1;
		}
		int index = lastIndex(arr, si+1, d);
		if(index == -1) {
			if (arr[si] == d) {
				return si;
			}else {
				return -1;
			}
		}else{
			return index;
		}
	}

}
