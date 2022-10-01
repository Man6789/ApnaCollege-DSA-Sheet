package aArrays;
/*
 Given an array of size N. The task is to find the maximum and the 
 minimum element of the array using the minimum number of comparisons.

Examples:

Input: arr[] = {3, 5, 4, 1, 9}
Output: Minimum element is: 1
              Maximum element is: 9

Input: arr[] = {22, 14, 8, 17, 35, 3}
Output:  Minimum element is: 3
              Maximum element is: 35
 */

import java.util.Arrays;

public class Q1_Max_And_Min {
	
	public static void main(String[] args) {
		int[] arr = new int[] {3, 5, 4, 1, 9};
		System.out.println(Arrays.toString(find(arr)));
	}//main end

	private static int[] find(int[] arr) {
		int min = arr[0], max = arr[0];
		for(int i=1; i<arr.length; i++) {
			if(arr[i] > max) max = arr[i];
			if(arr[i] < min) min = arr[i];
		}
		System.out.println(min + " " +  max);
		return new int[] {min, max};
	}
}
