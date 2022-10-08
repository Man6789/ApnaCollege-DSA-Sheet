package pkg.search.binary;

import java.util.*;

//Find the element in the array which is greater than or equal to target, is the Ceiling of the number.

public class Q1_ceilingOfNumber {
	public static void main(String[] args) {

		int target = 89;
		int[] arr = { 1, 2, 3, 4, 6, 78, 89, 98, 112 };
		System.out.println(binarySearch(arr, 0, arr.length, target));

	}// main end

	static int binarySearch(int[] arr, int start, int end, int target) {
		int ans = 0;
		while (start <= end) {
			int mid = (end + start) / 2;

			if (arr[mid] == target) {
				ans = arr[mid];
				break; // if the target is equal to the element then store in ans and break the loop as we already got the ans, no need for further iteration.
			} else if (arr[mid] > target) {
				end = mid - 1;
				ans = arr[mid];            //this will just store the element that is greater than the target in ans variable, every time new element is greater it will update the value.
			} else {
				start = mid + 1;
			}
		}

		return ans;

	}// binarySearch end

}
