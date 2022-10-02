package dsa.sorting;

public class Merge_Two_Sorted_Arrays {
	public static void main(String[] args) {
		
		int[] arr1 = {10,20,30,40,50};
		int[] arr2 = {5,15,30,45,60,70,80,90};
		int[] merged = mergeSortedArray(arr1, arr2);
		
		for(int i=0; i<merged.length; i++) {
			System.out.print(merged[i] + " ");
		}
		
	}//main end
	
	public static int[] mergeSortedArray(int[] arr1, int[] arr2) {
		int[] merged = new int[arr1.length+arr2.length];
		int i=0, j=0, k=0;
		while(i < arr1.length && j<arr2.length) {
			if(arr1[i] <= arr2[j]) {
				merged[k] = arr1[i];
				i++;
				k++;
			}else {
				merged[k] = arr2[j];
				j++;
				k++;
			}
			
		}//while end
		/*
		 * after while loop there can be 2 conditions, either arr1 is exhausted or arr2 is exhausted.
		 * if arr1 is exhausted then merge all the remaining elements of arr2 directly in merged.b 
		*/
		
		
		if(i==arr1.length) {
			while(j<arr2.length) {
				merged[k] = arr2[j];
				j++;
				k++;
			}
		}
		if(j==arr2.length) {
			while(i<arr1.length) {
				merged[k] = arr1[i];
				i++;
				k++;
			}
		}
		
		
		
		return merged;
	}

}
