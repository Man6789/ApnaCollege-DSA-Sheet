package aArrays;
/*
 Given an integer array nums, find the contiguous subarray 
 (containing at least one number) which has the largest sum and return its sum.
A subarray is a contiguous part of an array.
Example 1:
Input: nums = [-2,1,-3,4,-1,2,1,-5,4]
Output: 6
Explanation: [4,-1,2,1] has the largest sum = 6.

Example 2:
Input: nums = [1]
Output: 1
 */

public class Q3_Max_SubArrays {
	public static void main(String[] args) {
		int[] nums = new int[] { -2, 1, -3, 4, -1, 2, 1, -5, 4 };
		System.out.println(maxSubArray(nums));
	}// main

	public static int maxSubArray(int[] nums) {
//		// Approach 1. Bruteforce
//		int sum = nums[0];
//		for (int i = 0; i < nums.length - 1; i++) {
//			for (int j = i + 1; j < nums.length; j++) {
//				int temp = 0;
//				for (int k = i; k <= j; k++) {
//					temp += nums[k];
//				}
//				if (temp > sum) {
//					sum = temp;
//				}
//			}
//		}
//		return sum;
		
		//Approach 2. Kadane's Algorithm
		int curSum = 0, maxSum = 0;
		for(int i=0; i<nums.length; i++) {
			curSum += nums[i];
			if(curSum > maxSum) {
				maxSum = curSum;
			}
			if(curSum < 0) {
				curSum = 0;
			}
		}
		return maxSum;
		
		
		

	}

}
