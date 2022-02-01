class Solution {
    public int maxProfit(int[] prices) {
        int maxProf = 0;
        int minPrice = Integer.MAX_VALUE;
        
        for(int i = 0; i < prices.length; i++) {
            if(prices[i] < minPrice) {
                minPrice = prices[i];
            } else if(prices[i] - minPrice > maxProf) {
                maxProf = prices[i] - minPrice;
            }
        }
        return maxProf;
        
        /*
        int maxProf = 0;
        int i = 0;
        int j = i + 1;
        
        while(i < prices.length - 1 && j < prices.length) {
            if(prices[i] > prices[j]) {
                i++;
                j++;
            } else {
                maxProf = max(maxProf, prices[j] - prices[i]);
                j++;
                if(j < prices.length - 1 && prices[j] < prices[i]) {
                    i = j;
                    j = i + 1;
                }
            }
        }
        return maxProf;
        */
    }
    
    /*
    private int max(int a, int b) {
        if(a > b) {
            return a;
        } else {
            return b;
        }
    }
    */
}