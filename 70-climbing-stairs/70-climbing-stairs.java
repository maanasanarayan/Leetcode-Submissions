class Solution {
    public int climbStairs(int n) {
        /*
        DP problem similar to Fibonacci numbers.
        Each index in the stair array stores the number of ways to get to
        that index.
        */
        
        int[] stair = new int[n + 1];
        stair[0] = 1;
        stair[1] = 2;
        
        for(int i = 2; i < n; i++) {
            stair[i] = stair[i-1] + stair[i-2];
        }
        
        return stair[n - 1];
    }
}