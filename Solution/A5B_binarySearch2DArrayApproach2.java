package pkg.search.binary;

import java.util.*;

//apply binary search on the matrix using row and col reduction method

public class A5B_binarySearch2DArrayApproach2 {
	public static void main(String[] args) {
		int[][] arr = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 10, 11, 12 } };
		int target = 6;
		System.out.println(Arrays.toString(search(arr, target)));

	}// main end

	static int[] search(int[][] arr, int target) {
		int r = 0;
		int c = arr.length - 1;
		while (r < arr.length && c >= 0) {
			int mid = (r + c)/2;
			if(arr[r][mid] == target) {
				
			}
			
			
		}
			return null;
	}
}
