class Solution {
    public int[] sortedSquares(int[] nums) {
        int[] res = new int[nums.length];
        int i = 0;
        int j = nums.length - 1; 
        int k = nums.length - 1;
        int sq;
        
        while(i <= j && i < nums.length && j >= 0) {
            if(Math.abs(nums[i]) > Math.abs(nums[j])) {
                sq = nums[i] * nums[i];
                i++;
            } else {
                sq = nums[j] * nums[j];
                j--;
            }
            res[k--] = sq;
        }
        
        return res;
    }
}