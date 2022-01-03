class Solution {
    public void moveZeroes(int[] nums) {
        
        int count = 0;
        for(int i = 0; i < nums.length; i++) {
            if(nums[i] == 0) {
                count++;
            }
        }
        
        int index = 0;
        while(count != 0) {
            if(nums[index] == 0) {
                for(int i = index + 1; i < nums.length; i++) {
                    nums[i-1] = nums[i];
                }
                nums[nums.length - 1] = 0;
                count--;
                index--;
            }
            index++;
        }
    }
}