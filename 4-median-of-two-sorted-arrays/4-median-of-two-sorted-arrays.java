class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int[] nums = new int[nums1.length + nums2.length];
        int i = 0, j = 0, k = 0;
        double ans = 0.0;
        
        while(i < nums1.length && j < nums2.length) {
            if(nums1[i] <= nums2[j]) {
                nums[k++] = nums1[i++];
            } else {
                nums[k++] = nums2[j++];
            }
        }
        
        while(i < nums1.length) {
            nums[k++] = nums1[i++];
        }
        
        while(j < nums2.length) {
            nums[k++] = nums2[j++];
        }
        
        if(nums.length % 2 != 0) {
            int mid = nums.length/2;
            ans = (double) nums[mid];
        } else {
            int mid1 = nums.length/2;
            int mid2 = nums.length/2 - 1;
            ans = ((double) nums[mid1] + (double) nums[mid2]) / 2.0;
        }
        
        return ans;
    }
}