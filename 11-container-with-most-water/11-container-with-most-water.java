class Solution {
    public int maxArea(int[] height) {
        
        //Brute Force - TLE
        /*
        int maxArea = 0;
        
        for(int i = 0; i < height.length; i++) {
            for(int j = i + 1; j < height.length; j++) {
                int area = (j - i) * Math.min(height[i], height[j]);
                maxArea = Math.max(maxArea, area);
            }
        }
        
        return maxArea;
        */
        int maxArea = 0;
        int lp = 0; 
        int rp = height.length - 1;
        
        while(lp < rp) {
            int area = (rp - lp) * Math.min(height[lp], height[rp]);
            maxArea = Math.max(area, maxArea);
            
            if(height[lp] < height[rp]) {
                lp++;
            } else {
                rp--;
            }
        }
        return maxArea;
    }
}