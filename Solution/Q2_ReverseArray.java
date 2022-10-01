package aArrays;

import java.util.Arrays;

/*
 Given an array (or string), the task is to reverse the array/string.
Examples : 
Input  : arr[] = {1, 2, 3}
Output : arr[] = {3, 2, 1}

Input :  arr[] = {4, 5, 1, 2}
Output : arr[] = {2, 1, 5, 4}
 */
public class Q2_ReverseArray {
	public static void main(String[] args) {
		int[] arr = new int[]{1, 2, 3};
		int[] arr2 = new int[] {4, 5, 1, 2};
		rev(arr);
		rev(arr2);
		System.out.println(Arrays.toString(arr));
		System.out.println(Arrays.toString(arr2));
	}//main end

	private static void rev(int[] arr) {
		int i=0, j=arr.length-1;
		while(i<j) {
			int temp = arr[i];
			arr[i] = arr[j];
			arr[j] = temp;
			i++; j--;
		}
		//return arr;
	}
}
