package recursion;

public class Q10_Bubble_Sort {
	public static void main(String[] args) {
		int[] arr2 = {5,4,3,2,1};
		BS(arr2, 0, 4);
		display(arr2);
	}//main end
	
	public static void BS(int[] arr, int si, int li) {
		
		if(li == 0) {
			return;
		}
		
		if(si == li) {
			BS(arr, 0, li-1);
			return;
		}
		
		if(arr[si] > arr[si+1]) {
			int temp = arr[si];
			arr[si] = arr[si+1];
			arr[si+1] = temp;
		}
		BS(arr, si+1, li);
	}//BS end
	
	public static void display(int[] arr2) {
		for(int i=0; i<arr2.length; i++) {
			System.out.print(arr2[i] + " ");
		}
	}

}
