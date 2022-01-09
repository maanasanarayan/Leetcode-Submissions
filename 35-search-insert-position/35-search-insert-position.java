class Solution {
    public int searchInsert(int[] nums, int target) {
        int lp = 0;
        int rp = nums.length - 1;
        
        int count = 0;
        
        while(lp <= rp) {
            int mid = lp + (rp - lp) / 2;
            
            if(nums[mid] == target) {
                return mid;
            } else if(nums[mid] < target) {
                lp = mid + 1;
            } else {
                rp = mid - 1;
            }
        }
        
        return lp;
    }
}