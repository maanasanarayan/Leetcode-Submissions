class Solution {
    public int[] sortArrayByParity(int[] nums) {
        int i = 0;
        int j = nums.length - 1;
        
        while(i < j) {
            if(nums[i] % 2 == 0) {
                if(nums[j] % 2 == 1) {
                    i++;
                    j--;
                } else {
                    i++;
                }
            } else {
                if(nums[j] % 2 == 1) {
                   j--;
                } else {
                    int temp = nums[i];
                    nums[i] = nums[j];
                    nums[j] = temp;
                    i++;
                    j--;
                }
            }
        }
        
        return nums;
    }
}