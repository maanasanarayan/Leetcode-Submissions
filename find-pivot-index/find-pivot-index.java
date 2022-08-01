class Solution {
    public int pivotIndex(int[] nums) {
        /*
        My solution was to maintain two arrays - one for Prefix sum and one for Suffix sum. Traverse them together.
        */
        
        int sum = 0, leftSum = 0;
        
        for(int i = 0; i < nums.length; i++) {
            sum = sum + nums[i];
        }
        
        for(int i = 0; i < nums.length; i++) {
            if(leftSum == sum - nums[i] - leftSum) {
                return i;
            }
            
            leftSum = leftSum + nums[i];
        }
        
        return -1;
    }
}