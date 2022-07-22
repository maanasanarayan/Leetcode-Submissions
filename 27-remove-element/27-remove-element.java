class Solution {
    public int removeElement(int[] nums, int val) {
        int i = 0;
        int k = nums.length - 1;
        int temp;
        
        while(i <= k) {
            if(nums[k] == val) {
                k--;
            } else if(nums[i] == val) {
                temp = nums[i];
                nums[i] = nums[k];
                nums[k] = temp;
                k--;
                i++;
            } else {
                i++;
            }
        }
        return k+1;
    }
}