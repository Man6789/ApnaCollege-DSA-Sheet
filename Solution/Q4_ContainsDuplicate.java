package aArrays;
/*
 Given an integer array nums, return true if any value appears at least twice in the array, 
 and return false if every element is distinct.
Example 1:
Input: nums = [1,2,3,1]
Output: true

Example 2:
Input: nums = [1,2,3,4]
Output: false
 */

import java.util.Arrays;

public class Q4_ContainsDuplicate {
	public static void main(String[] args) {

		int[] nums = new int[] { 1, 2, 3, 1 };
		System.out.println(dupli(nums));
	}

	private static boolean dupli(int[] nums) {

		// Approach 1. Bruteforce O(N^2)
//		for (int i = 0; i < nums.length - 1; i++) {
//			for (int j = i + 1; j < nums.length; j++) {
//				if (nums[i] == nums[j]) {
//					return true;
//				}
//			}
//		}
//		return false;

		// Approach 2. Using Sort
		Arrays.sort(nums);
		for (int i = 0; i < nums.length - 1; i++) {
			if (nums[i] == nums[i + 1]) {
				return true;
			}
		}
		return false;

	}

}
