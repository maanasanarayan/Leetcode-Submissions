class Solution {
    public int search(int[] nums, int target) {
        
        if(nums.length == 1) {
            return nums[0] == target ? 0 : -1;
        }
        
        int rotation_index = findRotatedIndex(nums, 0, nums.length-1);        
        int index = -1;
        
        System.out.println(rotation_index);
        
        if(rotation_index == 0) {
            index = search(nums, 0, nums.length - 1, target);
        } else if(target < nums[0]) {
            index = search(nums, rotation_index, nums.length - 1, target);
        } else {
            index = search(nums, 0, rotation_index - 1, target);
        }
        return index;
    }
    
    private int search(int[] nums, int left, int right, int target) {
        while(left <= right) {
            int mid = left + (right - left)/2;
            if(nums[mid] == target) {
                return mid;
            } else if(nums[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return -1;
    }
    
    private int findRotatedIndex(int[] nums, int left, int right) {
        if(nums[left] < nums[right]) {
            return 0;
        }
        
        while(left <= right) {
            int mid = (left + right)/2;
            
            if(nums[mid] > nums[mid+1]) {
                return mid+1;
            }
             
            if (nums[mid] < nums[left])
              right = mid - 1;
            else
              left = mid + 1;
             
        }
        return 0;
        
    }
}