class Solution {
    public int findNumbers(int[] nums) {
        int count = 0;
        
        for(int i = 0; i < nums.length; i++) {
            int temp = nums[i];
            int tempcnt = 1;
            while(temp != 0) {
                temp = temp / 10;
                if(temp != 0) tempcnt++; 
            }
            
            if(tempcnt % 2 == 0) {
                count++;
            }
        }
        
        return count;
    }
}