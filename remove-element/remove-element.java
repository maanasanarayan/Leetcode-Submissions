class Solution {
    public int removeElement(int[] nums, int val) {
        
        int i = 0;
        int j = nums.length - 1;
        int count = 0;
        int temp;
        
        while(i <= j) {
            if(nums[i] == val && nums[j] == val) {
                j--;
                count++;
            }
            else if(nums[j] == val) {
                i++;
                j--;
                count++;
            }
            else if(nums[i] == val) {
                temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
                i++;
                j--;
                count++;
            }
            else {
                i++;
            }
        }
        
        return nums.length - count;
    }
}