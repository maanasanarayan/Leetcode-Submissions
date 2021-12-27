class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] prefixProd = new int[nums.length];
        int[] postfixProd = new int[nums.length];
        int[] result = new int[nums.length];
        
        prefixProd[0] = nums[0];
        postfixProd[nums.length - 1] = nums[nums.length - 1];
        
        for(int i = 0; i < nums.length - 1; i++) {
            prefixProd[i+1] = prefixProd[i] * nums[i + 1];
        }
        
        for(int i = nums.length - 2; i >= 0; i--) {
            postfixProd[i] = postfixProd[i + 1] * nums[i];
        }
        
        for(int i = 0; i < nums.length; i++) {
            if(i == 0) {
                result[i] = postfixProd[i + 1];
            }
            else if(i == nums.length - 1) {
                result[i] = prefixProd[i - 1];
            }
            else {
                result[i] = prefixProd[i - 1] * postfixProd[i + 1];
            }             
        }
        
        return result;
    }
}