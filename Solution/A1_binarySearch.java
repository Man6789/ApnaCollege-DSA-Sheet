package pkg.search.binary;

import java.util.*;

public class A1_binarySearch {

	public static void main(String[] args) {
		int target = 1;
		int[] arr = { 1, 2, 3, 4, 6, 78, 89, 98, 112 };
		System.out.println(binarySearch(arr, 0, arr.length, target));

	}// main method end

	static int binarySearch(int[] arr, int start, int end, int target) {

		while (start <= end) {
			int mid = (end + start) / 2;
			if (arr[mid] == target) {
				return mid;
			} else if (arr[mid] > target) {
				end = mid - 1;
			} else {
				start = mid + 1;
			}
		}

		return -1;

	}// binarySearch end

}
