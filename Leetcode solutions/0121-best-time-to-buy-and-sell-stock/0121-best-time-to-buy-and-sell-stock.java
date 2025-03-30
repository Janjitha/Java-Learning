class Solution {
    public int maxProfit(int[] prices) {
        int min = Integer.MAX_VALUE;  // Track the minimum price
        int maxProfit = 0;  // Track the maximum profit 
        for (int price : prices) {
            min = Math.min(min, price);  // Update min price
            maxProfit = Math.max(maxProfit, price - min);  // Update max profit
        }
        return maxProfit;
    }
}

//         int min = Integer.MAX_VALUE; // Track min price
//         int maxProfit = 0; // Track max profit   
//         for (int price : prices) {
//             if (price < min) { 
//                 min = price; // Update min price if we find a new low
//             } else {
//                 maxProfit = Math.max(maxProfit, price - min); // Calculate profit
//             }
//         }
//         return maxProfit;
//     }
// }

/*
class Solution {
    public int maxProfit(int[] prices) {
        int min = prices[0];
        int profit = 0;
        int cost = 0;

        for(int i=0; i<prices.length; i++){
            cost = prices[i] - min;
            profit = Math.max(profit, cost);
            min = Math.min(prices[i], min);
        }
        return profit;
    }
}
*/
