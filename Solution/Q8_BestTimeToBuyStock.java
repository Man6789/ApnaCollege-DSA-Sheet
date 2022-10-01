package aArrays;
/*
https://leetcode.com/problems/best-time-to-buy-and-sell-stock/

You are given an array prices where prices[i] is the price of a given stock on the ith day.

You want to maximize your profit by choosing a single day to buy one stock and choosing a different day in the future to sell that stock.

Return the maximum profit you can achieve from this transaction. If you cannot achieve any profit, return 0.
Example 1:

Input: prices = [7,1,5,3,6,4]
Output: 5
Explanation: Buy on day 2 (price = 1) and sell on day 5 (price = 6), profit = 6-1 = 5.
Note that buying on day 2 and selling on day 1 is not allowed because you must buy before you sell.
Example 2:

Input: prices = [7,6,4,3,1]
Output: 0
Explanation: In this case, no transactions are done and the max profit = 0.
*/

public class Q8_BestTimeToBuyStock {
	
	public static void main(String[] args) {
		
		int[] nums = new int[] {7,1,5,3,6,4};
		
		System.out.println(maxPRec(nums, 0, 0, 0));
		
	}//main end
	
	//Approach 1. Recursive
	//static int maxAns = 0, curAns = 0;
	private static int maxPRec(int[] nums, int in, int curAns, int maxAns) {
		if(in == nums.length) {
			return maxAns;
		}
		for(int i=in+1; i<nums.length; i++) {
			curAns = nums[i] - nums[in];
			if(curAns > maxAns) maxAns = curAns;
			if(curAns < 0) curAns = 0; 
			
		}
		return maxPRec(nums, ++in, curAns, maxAns);
	}//maxPRec end
	
	
	//Approach 2. Iterative (Working)
	private static int maxP(int[] prices) {
		int curProfit = 0, maxProfit = 0;
        for(int i=0; i<prices.length-1; i++){
            
            for(int j=i+1; j<prices.length; j++){
                curProfit = prices[j] - prices[i];
                if(curProfit > maxProfit){
                    maxProfit = curProfit;
                }
                if(curProfit < 0){
                    curProfit = 0;
                }
            }
        }
        
        return maxProfit;
	}//maxP end


}
