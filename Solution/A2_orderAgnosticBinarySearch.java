package pkg.search.binary;

import java.util.*;

public class A2_orderAgnosticBinarySearch {
	public static void main(String[] args) {

		int[] arr = { 1, 2, 3, 4, 5, 8, 9 };
		int target = 3;
		System.out.println(orderAgnosticBS(arr, target));

	}// main end

	static int orderAgnosticBS(int[] arr, int target) {
		int start = 0, end = arr.length - 1;
		boolean isAsc = arr[start] < arr[end]; // this will check if the array is ascending or not
		while (start <= end) {
			int mid = start + (end - start) / 2;
			if (arr[mid] == target) {
				return mid;
			}
			if (isAsc) {
				if (arr[mid] > target) {
					end = mid - 1;
				} else {
					start = mid + 1;
				}
			} else {
				if (arr[mid] > target) {
					start = mid + 1;
				} else {
					end = mid - 1;
				}
			}
		} // while end

		return -1;
	}

}
