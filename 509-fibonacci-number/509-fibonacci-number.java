class Solution {
    public int fib(int n) {
      /* 
        // Recursive solution
        
        if (n == 0) {
            return 0;
        }
        else if(n == 1) {
            return 1;
        }
        else {
            return fib(n-1) + fib(n-2);
        }
        */
        
        // Iterative solution
        
        if(n == 0 || n == 1) {
            return n;
        }
        
        int[] fib = new int[n+1];
        
        fib[0] = 0;
        fib[1] = 1;
        
        for(int i = 2; i <= n; i++) {
            fib[i] = fib[i - 1] + fib[i - 2];
        }
        return fib[n];
        
    }
}