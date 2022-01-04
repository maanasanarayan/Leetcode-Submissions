class Solution {
    public int bitwiseComplement(int n) {
        int rem;
        int prod = 1;
        int num1 = 0;
        
        if(n == 0) {
            return 1;
        }
        
        while(n != 0) {
            rem = n % 2 == 0 ? 1 : 0;
            num1 += rem * prod;
            prod = prod * 2;
            n = n/2;
        }
        
        return num1;       
    }
}