import java.util.*;

class Solution {
    public int[] twoSum(int[] nums, int target) {
        
        Hashtable<Integer, Integer> ht = new Hashtable<>();
        int[] arr = new int[2];
        
        for(int i = 0; i<nums.length; i++) {
           if(ht.containsKey(target - nums[i])) {
               arr[0] = i;
               arr[1] = ht.get(target - nums[i]);
               return arr;
           } else {
               ht.put(nums[i], i);
           }
                     
        }
       
        return arr;
    }
}