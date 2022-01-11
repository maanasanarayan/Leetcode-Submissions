class Solution {
    public int[] sortedSquares(int[] nums) {
        
        /*
        int[] squareList = new int[nums.length];
        
        for(int i = 0; i < nums.length; i++){
            squareList[i] = nums[i] * nums[i];
        }
        
        Arrays.sort(squareList);
        
        return squareList;
        */
        
        int[] squareList = new int[nums.length];
        int k = squareList.length - 1;
        int i = 0;
        int j = nums.length - 1;
        
        while(i <= j) {
            if(Math.abs(nums[i]) < Math.abs(nums[j])) {
                squareList[k--] = nums[j] * nums[j];
                j--;
            } else {
                squareList[k--] = nums[i] * nums[i];
                i++;
            }
        }
        
        return squareList;
        
    }
}