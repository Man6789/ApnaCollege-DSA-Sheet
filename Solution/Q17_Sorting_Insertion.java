package dsa.sorting;

public class Sorting_Insertion {
	public static void main(String[] args) {
		int[] arr = {99,77,23,45,78};
		
		for (int counter=1; counter<arr.length; counter++) {
			int val = arr[counter];
			int j=counter-1;
			while(j>=0 && arr[j] > val) {
				arr[j+1] = arr[j];
				j--;
			}
			arr[j+1] = val;
			
		}
		
		for(int i=0; i<arr.length; i++) {
			System.out.println(arr[i]);
		}
		
	}//main method end

}//main class end
