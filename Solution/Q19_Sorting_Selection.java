package dsa.sorting;

public class Sorting_Selection {

	public static void main(String[] args) {
		int[] arr = {99,77,23,45,78};
		for (int i=0; i<arr.length-1; i++) {
			int min = i;
			for (int j=i+1; j<arr.length; j++) {
				if (arr[j] < arr[min]) {
					min = j;
				}
 			}// j for loop
			int temp = arr[min];
			arr[min] = arr[i];
			arr[i] = temp;
		}// i for loop
		
		// printing 
		for (int i=0; i<arr.length; i++) {
			System.out.println(arr[i]);
		}
		

	}

}
