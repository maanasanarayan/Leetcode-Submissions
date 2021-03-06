class Solution {
    public void moveZeroes(int[] nums) {
        int i = 0, j = 0;
        
        while(j < nums.length) {
            if(nums[j] == 0) {
                j++;
            } else {
                nums[i++] = nums[j++];
            }
        }
        
        while(i < nums.length) {
            nums[i++] = 0;
        }
    }
}