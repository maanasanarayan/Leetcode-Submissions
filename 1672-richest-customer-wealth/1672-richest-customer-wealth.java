class Solution {
    public int maximumWealth(int[][] accounts) {
        /*
        00 01 02
        10 11 12
        20 21 22
        */
        int maxWealth = 0;
        
        for(int i = 0; i < accounts.length; i++) {
            int sum = 0;
            for(int j = 0; j < accounts[0].length; j++) {
                sum = sum + accounts[i][j];
            }
            if(sum > maxWealth) {
                maxWealth = sum;
            }
        }
        return maxWealth;
    }
}