class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        /*
        // Runtime only 72%
        
        int count = 0;

        for(int i = 0; i < stones.length(); i++) {
            if(jewels.contains(String.valueOf(stones.charAt(i)))) {
                count++;
            }
        }
        
        return count;
        */
        
        // Runtime 100%
        
        int count = 0;
        for(int i = 0; i < stones.length(); i++) {
            for(int j = 0; j < jewels.length(); j++) {
                if(stones.charAt(i) == jewels.charAt(j)) {
                    count++;
                }
            }
        }
        return count;
    }
}
