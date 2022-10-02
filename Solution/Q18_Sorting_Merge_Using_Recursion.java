package dsa.sorting;

public class Sorting_Merge_Using_Recursion {
	public static void main(String[] args) {
		
		int[] arr = {4,21,34,65,33, 90,80,45,23,2};
		int[] arr2 = mergeSort(arr, 0, arr.length-1);
		
		for(int i =0; i<arr2.length; i++) {
			System.out.print(arr2[i] + " ");
		}
		
		
	}//main end
	
	
	public static int[] mergeSort(int[] arr, int lo, int hi) {
		if(lo == hi) {
			int[] br = new int[1];
			br[0] = arr[lo];
			return br;
		}
		int mid = (lo+hi)/2;
		
		
		int[] fh = mergeSort(arr, lo, mid);
		int[] sh = mergeSort(arr, mid+1 , hi);
		
		int[] merge = mergeSortedArray(fh, sh);
		
		return merge;
		
	}//mergeSort() end
	
	private static int[] mergeSortedArray(int[] arr1, int[] arr2) {
		
		int i=0, j=0, k=0;
		int[] merged = new int[arr1.length + arr2.length];
		while(i<arr1.length && j<arr2.length) {
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
		
		if(i == arr1.length) {
			while(j < arr2.length) {
				merged[k] = arr2[j];
				k++;
				j++;
			}	
		}
		if(j == arr2.length) {
			while(i < arr1.length) {
				merged[k] = arr1[i];
				i++;
				k++;
			}
		}
		
		return merged;
		
	}// mergeSortedArray() end

}
