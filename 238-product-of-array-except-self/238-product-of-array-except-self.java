class Solution {
    public int[] productExceptSelf(int[] nums) {
        
        // Using prefix and suffix arrays
        /*
        int n = nums.length;
        int[] ans = new int[n];
        int[] pre = new int[n];
        int[] post = new int[n];
        
        pre[0] = 1;
        post[n - 1] = 1;
        
        for(int i = 1; i < n; i++) {
            pre[i] = pre[i-1] * nums[i-1];
        }
        
        for(int j = n - 2; j >= 0; j--) {
            post[j] = post[j+1] * nums[j+1];
        }
        
        for(int k = 0; k < n; k++) {
            ans[k] = pre[k]*post[k];
        }
        
        return ans;
        */
        
        int n = nums.length;
        int[] ans = new int[n];
        
        ans[0] = 1;
        int post = 1;
        
        for(int i = 1; i < n; i++) {
            ans[i] = ans[i-1] * nums[i-1];
        }
        
        for(int j = n - 2; j >= 0; j--) {
            post = post * nums[j+1];
            ans[j] = ans[j] * post;
        }
        
        return ans;
    }
}