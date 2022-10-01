package aArrays;

import java.util.Arrays;

/*
 * https://www.geeksforgeeks.org/chocolate-distribution-problem/
 Given an array of N integers where each value represents the number of chocolates in a packet. 
 Each packet can have a variable number of chocolates. 
 There are m students, the task is to distribute chocolate packets such that: 
Each student gets one packet.
The difference between the number of chocolates in the packet with maximum chocolates and 
the packet with minimum chocolates given to the students is minimum.

Examples:
Input : arr[] = {7, 3, 2, 4, 9, 12, 56} , m = 3 
Output: Minimum Difference is 2 
Explanation:
We have seven packets of chocolates and we need to pick three packets for 3 students 
If we pick 2, 3 and 4, we get the minimum difference between maximum and minimum packet sizes.

Input : arr[] = {3, 4, 1, 9, 56, 7, 9, 12} , m = 5 
Output: Minimum Difference is 6 
 */
public class Q5_ChocolateDistributionProblem {
	public static void main(String[] args) {
		int[] nums = new int[] { 7, 3, 2, 4, 9, 12, 56 };
		System.out.println(findMinDiff(nums, 3));
	}// main end0

	private static int findMinDiff(int[] nums, int m) {
		//Approach 1. Naive Approach. TC - O(NlogN)
		Arrays.sort(nums);
		int finalDiff = Integer.MAX_VALUE;
		for(int i=0; i<nums.length-m; i++) {
			int diff = nums[i+m-1] - nums[i]; 
			if( diff < finalDiff) finalDiff = diff;
		}
		return finalDiff;
	}
}
