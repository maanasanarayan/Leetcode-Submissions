class Solution {
    public int maxSubArray(int[] nums) {
        int maxSum = Integer.MIN_VALUE;
        int sum = 0;
        
        for(int i = 0; i < nums.length; i++) {
            sum = max(nums[i], sum + nums[i]);
            maxSum = max(maxSum, sum);
        }
        
        return maxSum;
    }
    private int max(int a, int b) {
        if(a > b) {
            return a;
        } else {
            return b;
        }
    }
}