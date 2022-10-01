package aArrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
 * https://leetcode.com/problems/permutations/
Given an array nums of distinct integers, return all the possible permutations. You can return the answer in any order.
Example 1:
Input: nums = [1,2,3]
Output: [[1,2,3],[1,3,2],[2,1,3],[2,3,1],[3,1,2],[3,2,1]]

Example 2:
Input: nums = [0,1]
Output: [[0,1],[1,0]]
 */

public class Q7a_Permutations {
	public static void main(String[] args) {
		int[] nums = new int[] { 1, 2, 3 };

		System.out.println(permute(nums));

	}// main end

	public static List<List<Integer>> permute(int[] nums) {
		List<List<Integer>> ans = new ArrayList<>();
		List<Integer> ds = new ArrayList<>();
		boolean[] freq = new boolean[nums.length];
		recurPermute(nums, ds, ans, freq);
		return ans;
	}// permute end

	private static void recurPermute(int[] nums, List<Integer> ds, List<List<Integer>> ans, boolean[] freq) {
		if (ds.size() == nums.length) {
			ans.add(new ArrayList<>(ds));
			return;
		}
		for (int i = 0; i < nums.length; i++) {
			if (!freq[i]) {
				ds.add(nums[i]);
				freq[i] = true;
				recurPermute(nums, ds, ans, freq);
				ds.remove(ds.size() - 1);
				freq[i] = false;
			}
			
		}
	}// recurPermute end

}
