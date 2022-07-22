class Solution {
    public int removeDuplicates(int[] nums) {
        int i = 0;
        int j = i + 1;
        boolean found = false;
        
        while(j < nums.length) {
            if(nums[i] == nums[j]) {
                j++;
                found = true;
            } else if(found) {
                i++;
                nums[i] = nums[j];
                found = false;
            } else {
                i++;
                j++;
            }
        }
        
        return i + 1;
    }
}