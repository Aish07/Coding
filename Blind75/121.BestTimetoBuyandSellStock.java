package Blind75;


//One pass hash map
/**
 * The points of interest are the peaks and valleys in the given graph. 
 * We need to find the largest price following each valley, which difference could be the max profit.
 * We can maintain two variables - minprice and maxprofit corresponding to the smallest valley 
 * and maximum profit (maximum difference between selling price and minprice) obtained so far respectively.
 */
class Solution {
    public int maxProfit(int[] prices) {
        int n = prices.length;
        int maxProfit = 0;
        int currMin = Integer.MAX_VALUE;
        for(int i=0; i<n; i++){
            if(prices[i]<currMin){
                currMin = prices[i];
            }
            else{
                maxProfit = Math.max(maxProfit, prices[i]-currMin);
            }
        }
        return maxProfit;
    }
}


/**
Time complexity: O(n). Only a single pass is needed.
Space complexity: O(1). Only two variables are used.

 */